package behavioral.visitor.visitors.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import behavioral.visitor.models.SpaceElement;
import behavioral.visitor.models.impl.Moon;
import behavioral.visitor.models.impl.Planet;
import behavioral.visitor.models.impl.Star;
import behavioral.visitor.visitors.Visitor;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class XmlVisitorTest {
    /**
     * Method under test: {@link XmlVisitor#visitPlanet(Planet)}
     */
    @Test
    void testVisitPlanet() {
        // Arrange
        XmlVisitor xmlVisitor = new XmlVisitor();

        // Act and Assert
        assertEquals("        <planet>\n" + "            <name>Name</name>\n" + "            <moons number=0>\n"
                + "            </moons>\n" + "        </planet>\n", xmlVisitor.visitPlanet(new Planet("Name")));
    }

    /**
     * Method under test: {@link XmlVisitor#visitPlanet(Planet)}
     */
    @Test
    void testVisitPlanet2() {
        // Arrange
        XmlVisitor xmlVisitor = new XmlVisitor();
        SpaceElement moon = mock(SpaceElement.class);
        when(moon.accept(Mockito.<Visitor>any())).thenReturn("Accept");

        Planet planet = new Planet("Name");
        planet.addMoon(moon);

        // Act
        String actualVisitPlanetResult = xmlVisitor.visitPlanet(planet);

        // Assert
        verify(moon).accept(Mockito.<Visitor>any());
        assertEquals("        <planet>\n" + "            <name>Name</name>\n" + "            <moons number=1>\n"
                + "Accept            </moons>\n" + "        </planet>\n", actualVisitPlanetResult);
    }

    /**
     * Method under test: {@link XmlVisitor#visitPlanet(Planet)}
     */
    @Test
    void testVisitPlanet3() {
        // Arrange
        XmlVisitor xmlVisitor = new XmlVisitor();
        SpaceElement moon = mock(SpaceElement.class);
        when(moon.accept(Mockito.<Visitor>any())).thenReturn("Accept");
        SpaceElement moon2 = mock(SpaceElement.class);
        when(moon2.accept(Mockito.<Visitor>any())).thenReturn("Accept");

        Planet planet = new Planet("Name");
        planet.addMoon(moon2);
        planet.addMoon(moon);

        // Act
        String actualVisitPlanetResult = xmlVisitor.visitPlanet(planet);

        // Assert
        verify(moon2).accept(Mockito.<Visitor>any());
        verify(moon).accept(Mockito.<Visitor>any());
        assertEquals("        <planet>\n" + "            <name>Name</name>\n" + "            <moons number=2>\n"
                + "AcceptAccept            </moons>\n" + "        </planet>\n", actualVisitPlanetResult);
    }

    /**
     * Method under test: {@link XmlVisitor#visitStar(Star)}
     */
    @Test
    void testVisitStar() {
        // Arrange
        XmlVisitor xmlVisitor = new XmlVisitor();

        // Act and Assert
        assertEquals("    <star>\n        <name>Name</name>\n        <planets number=0>\n        </planets>\n    </star>\n",
                xmlVisitor.visitStar(new Star("Name")));
    }

    /**
     * Method under test: {@link XmlVisitor#visitStar(Star)}
     */
    @Test
    void testVisitStar2() {
        // Arrange
        XmlVisitor xmlVisitor = new XmlVisitor();
        SpaceElement planet = mock(SpaceElement.class);
        when(planet.accept(Mockito.<Visitor>any())).thenReturn("Accept");

        Star star = new Star("Name");
        star.addPlanet(planet);

        // Act
        String actualVisitStarResult = xmlVisitor.visitStar(star);

        // Assert
        verify(planet).accept(Mockito.<Visitor>any());
        assertEquals("    <star>\n" + "        <name>Name</name>\n" + "        <planets number=1>\n"
                + "Accept        </planets>\n" + "    </star>\n", actualVisitStarResult);
    }

    /**
     * Method under test: {@link XmlVisitor#visitStar(Star)}
     */
    @Test
    void testVisitStar3() {
        // Arrange
        XmlVisitor xmlVisitor = new XmlVisitor();
        SpaceElement planet = mock(SpaceElement.class);
        when(planet.accept(Mockito.<Visitor>any())).thenReturn("Accept");
        SpaceElement planet2 = mock(SpaceElement.class);
        when(planet2.accept(Mockito.<Visitor>any())).thenReturn("Accept");

        Star star = new Star("Name");
        star.addPlanet(planet2);
        star.addPlanet(planet);

        // Act
        String actualVisitStarResult = xmlVisitor.visitStar(star);

        // Assert
        verify(planet2).accept(Mockito.<Visitor>any());
        verify(planet).accept(Mockito.<Visitor>any());
        assertEquals("    <star>\n" + "        <name>Name</name>\n" + "        <planets number=2>\n"
                + "AcceptAccept        </planets>\n" + "    </star>\n", actualVisitStarResult);
    }

    /**
     * Method under test: {@link XmlVisitor#visitMoon(Moon)}
     */
    @Test
    void testVisitMoon() {
        // Arrange
        XmlVisitor xmlVisitor = new XmlVisitor();

        // Act and Assert
        assertEquals("            <moon>\n                <name>Name</name>\n            </moon>\n",
                xmlVisitor.visitMoon(new Moon("Name")));
    }

    /**
     * Method under test: {@link XmlVisitor#visitMoon(Moon)}
     */
    @Test
    void testVisitMoon2() {
        // Arrange
        SpaceElement moon = mock(SpaceElement.class);
        when(moon.accept(Mockito.<Visitor>any())).thenReturn("Accept");

        Planet planet = new Planet("    ");
        planet.addMoon(moon);

        XmlVisitor xmlVisitor = new XmlVisitor();
        xmlVisitor.visitPlanet(planet);

        // Act
        String actualVisitMoonResult = xmlVisitor.visitMoon(new Moon("Name"));

        // Assert
        verify(moon).accept(Mockito.<Visitor>any());
        assertEquals("            <moon>\n                <name>Name</name>\n            </moon>\n", actualVisitMoonResult);
    }
}
