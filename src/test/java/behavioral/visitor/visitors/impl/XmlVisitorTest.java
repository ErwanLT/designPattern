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
     * Method under test: {@link XmlExporter#visitPlanet(Planet)}
     */
    @Test
    void testVisitPlanet() {
        // Arrange
        XmlExporter xmlExporter = new XmlExporter();

        // Act and Assert
        assertEquals("        <planet>\n" + "            <name>Name</name>\n" + "            <moons number=0>\n"
                + "            </moons>\n" + "        </planet>\n", xmlExporter.visitPlanet(new Planet("Name")));
    }

    /**
     * Method under test: {@link XmlExporter#visitPlanet(Planet)}
     */
    @Test
    void testVisitPlanet2() {
        // Arrange
        XmlExporter xmlExporter = new XmlExporter();
        SpaceElement moon = mock(SpaceElement.class);
        when(moon.accept(Mockito.<Visitor>any())).thenReturn("Accept");

        Planet planet = new Planet("Name");
        planet.addMoon(moon);

        // Act
        String actualVisitPlanetResult = xmlExporter.visitPlanet(planet);

        // Assert
        verify(moon).accept(Mockito.<Visitor>any());
        assertEquals("        <planet>\n" + "            <name>Name</name>\n" + "            <moons number=1>\n"
                + "Accept            </moons>\n" + "        </planet>\n", actualVisitPlanetResult);
    }

    /**
     * Method under test: {@link XmlExporter#visitPlanet(Planet)}
     */
    @Test
    void testVisitPlanet3() {
        // Arrange
        XmlExporter xmlExporter = new XmlExporter();
        SpaceElement moon = mock(SpaceElement.class);
        when(moon.accept(Mockito.<Visitor>any())).thenReturn("Accept");
        SpaceElement moon2 = mock(SpaceElement.class);
        when(moon2.accept(Mockito.<Visitor>any())).thenReturn("Accept");

        Planet planet = new Planet("Name");
        planet.addMoon(moon2);
        planet.addMoon(moon);

        // Act
        String actualVisitPlanetResult = xmlExporter.visitPlanet(planet);

        // Assert
        verify(moon2).accept(Mockito.<Visitor>any());
        verify(moon).accept(Mockito.<Visitor>any());
        assertEquals("        <planet>\n" + "            <name>Name</name>\n" + "            <moons number=2>\n"
                + "AcceptAccept            </moons>\n" + "        </planet>\n", actualVisitPlanetResult);
    }

    /**
     * Method under test: {@link XmlExporter#visitStar(Star)}
     */
    @Test
    void testVisitStar() {
        // Arrange
        XmlExporter xmlExporter = new XmlExporter();

        // Act and Assert
        assertEquals("    <star>\n        <name>Name</name>\n        <planets number=0>\n        </planets>\n    </star>\n",
                xmlExporter.visitStar(new Star("Name")));
    }

    /**
     * Method under test: {@link XmlExporter#visitStar(Star)}
     */
    @Test
    void testVisitStar2() {
        // Arrange
        XmlExporter xmlExporter = new XmlExporter();
        SpaceElement planet = mock(SpaceElement.class);
        when(planet.accept(Mockito.<Visitor>any())).thenReturn("Accept");

        Star star = new Star("Name");
        star.addPlanet(planet);

        // Act
        String actualVisitStarResult = xmlExporter.visitStar(star);

        // Assert
        verify(planet).accept(Mockito.<Visitor>any());
        assertEquals("    <star>\n" + "        <name>Name</name>\n" + "        <planets number=1>\n"
                + "Accept        </planets>\n" + "    </star>\n", actualVisitStarResult);
    }

    /**
     * Method under test: {@link XmlExporter#visitStar(Star)}
     */
    @Test
    void testVisitStar3() {
        // Arrange
        XmlExporter xmlExporter = new XmlExporter();
        SpaceElement planet = mock(SpaceElement.class);
        when(planet.accept(Mockito.<Visitor>any())).thenReturn("Accept");
        SpaceElement planet2 = mock(SpaceElement.class);
        when(planet2.accept(Mockito.<Visitor>any())).thenReturn("Accept");

        Star star = new Star("Name");
        star.addPlanet(planet2);
        star.addPlanet(planet);

        // Act
        String actualVisitStarResult = xmlExporter.visitStar(star);

        // Assert
        verify(planet2).accept(Mockito.<Visitor>any());
        verify(planet).accept(Mockito.<Visitor>any());
        assertEquals("    <star>\n" + "        <name>Name</name>\n" + "        <planets number=2>\n"
                + "AcceptAccept        </planets>\n" + "    </star>\n", actualVisitStarResult);
    }

    /**
     * Method under test: {@link XmlExporter#visitMoon(Moon)}
     */
    @Test
    void testVisitMoon() {
        // Arrange
        XmlExporter xmlExporter = new XmlExporter();

        // Act and Assert
        assertEquals("            <moon>\n                <name>Name</name>\n            </moon>\n",
                xmlExporter.visitMoon(new Moon("Name")));
    }

    /**
     * Method under test: {@link XmlExporter#visitMoon(Moon)}
     */
    @Test
    void testVisitMoon2() {
        // Arrange
        SpaceElement moon = mock(SpaceElement.class);
        when(moon.accept(Mockito.<Visitor>any())).thenReturn("Accept");

        Planet planet = new Planet("    ");
        planet.addMoon(moon);

        XmlExporter xmlExporter = new XmlExporter();
        xmlExporter.visitPlanet(planet);

        // Act
        String actualVisitMoonResult = xmlExporter.visitMoon(new Moon("Name"));

        // Assert
        verify(moon).accept(Mockito.<Visitor>any());
        assertEquals("            <moon>\n                <name>Name</name>\n            </moon>\n", actualVisitMoonResult);
    }
}
