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

class JsonExporterTest {
    /**
     * Method under test: {@link JsonExporter#visitStar(Star)}
     */
    @Test
    void testVisitStar() {
        // Arrange
        JsonExporter jsonExporter = new JsonExporter();

        // Act and Assert
        assertEquals(
                "        \"star\":{\n            \"name\":\"Name\",\n            \"planets\":[\n            ]\n        }\n",
                jsonExporter.visitStar(new Star("Name")));
    }

    /**
     * Method under test: {@link JsonExporter#visitStar(Star)}
     */
    @Test
    void testVisitStar2() {
        // Arrange
        JsonExporter jsonExporter = new JsonExporter();
        SpaceElement planet = mock(SpaceElement.class);
        when(planet.accept(Mockito.<Visitor>any())).thenReturn("Accept");

        Star star = new Star("Name");
        star.addPlanet(planet);

        // Act
        String actualVisitStarResult = jsonExporter.visitStar(star);

        // Assert
        verify(planet).accept(Mockito.<Visitor>any());
        assertEquals(
                "        \"star\":{\n            \"name\":\"Name\",\n            \"planets\":[\nAccept            ]\n        }\n",
                actualVisitStarResult);
    }

    /**
     * Method under test: {@link JsonExporter#visitStar(Star)}
     */
    @Test
    void testVisitStar3() {
        // Arrange
        JsonExporter jsonExporter = new JsonExporter();
        SpaceElement planet = mock(SpaceElement.class);
        when(planet.accept(Mockito.<Visitor>any())).thenReturn("Accept");
        SpaceElement planet2 = mock(SpaceElement.class);
        when(planet2.accept(Mockito.<Visitor>any())).thenReturn("Accept");

        Star star = new Star("Name");
        star.addPlanet(planet2);
        star.addPlanet(planet);

        // Act
        String actualVisitStarResult = jsonExporter.visitStar(star);

        // Assert
        verify(planet2).accept(Mockito.<Visitor>any());
        verify(planet).accept(Mockito.<Visitor>any());
        assertEquals("        \"star\":{\n" + "            \"name\":\"Name\",\n" + "            \"planets\":[\n"
                + "AcceptAccept            ]\n" + "        }\n", actualVisitStarResult);
    }

    /**
     * Method under test: {@link JsonExporter#visitPlanet(Planet)}
     */
    @Test
    void testVisitPlanet() {
        // Arrange
        JsonExporter jsonExporter = new JsonExporter();

        // Act and Assert
        assertEquals("            {\n" + "                \"name\":\"Name\",\n" + "                \"moons\":[\n"
                + "                ]\n" + "            },\n", jsonExporter.visitPlanet(new Planet("Name")));
    }

    /**
     * Method under test: {@link JsonExporter#visitPlanet(Planet)}
     */
    @Test
    void testVisitPlanet2() {
        // Arrange
        JsonExporter jsonExporter = new JsonExporter();
        SpaceElement moon = mock(SpaceElement.class);
        when(moon.accept(Mockito.<Visitor>any())).thenReturn("Accept");

        Planet planet = new Planet("Name");
        planet.addMoon(moon);

        // Act
        String actualVisitPlanetResult = jsonExporter.visitPlanet(planet);

        // Assert
        verify(moon).accept(Mockito.<Visitor>any());
        assertEquals("            {\n" + "                \"name\":\"Name\",\n" + "                \"moons\":[\n"
                + "Accept                ]\n" + "            },\n", actualVisitPlanetResult);
    }

    /**
     * Method under test: {@link JsonExporter#visitPlanet(Planet)}
     */
    @Test
    void testVisitPlanet3() {
        // Arrange
        JsonExporter jsonExporter = new JsonExporter();
        SpaceElement moon = mock(SpaceElement.class);
        when(moon.accept(Mockito.<Visitor>any())).thenReturn("Accept");
        SpaceElement moon2 = mock(SpaceElement.class);
        when(moon2.accept(Mockito.<Visitor>any())).thenReturn("Accept");

        Planet planet = new Planet("Name");
        planet.addMoon(moon2);
        planet.addMoon(moon);

        // Act
        String actualVisitPlanetResult = jsonExporter.visitPlanet(planet);

        // Assert
        verify(moon2).accept(Mockito.<Visitor>any());
        verify(moon).accept(Mockito.<Visitor>any());
        assertEquals("            {\n" + "                \"name\":\"Name\",\n" + "                \"moons\":[\n"
                + "AcceptAccept                ]\n" + "            },\n", actualVisitPlanetResult);
    }

    /**
     * Method under test: {@link JsonExporter#visitMoon(Moon)}
     */
    @Test
    void testVisitMoon() {
        // Arrange
        JsonExporter jsonExporter = new JsonExporter();

        // Act and Assert
        assertEquals("                {\n                    \"name\":\"Name\"\n                },\n",
                jsonExporter.visitMoon(new Moon("Name")));
    }

    /**
     * Method under test: {@link JsonExporter#visitMoon(Moon)}
     */
    @Test
    void testVisitMoon2() {
        // Arrange
        SpaceElement planet = mock(SpaceElement.class);
        when(planet.accept(Mockito.<Visitor>any())).thenReturn("Accept");

        Star star = new Star("    ");
        star.addPlanet(planet);

        JsonExporter jsonExporter = new JsonExporter();
        jsonExporter.visitStar(star);

        // Act
        String actualVisitMoonResult = jsonExporter.visitMoon(new Moon("Name"));

        // Assert
        verify(planet).accept(Mockito.<Visitor>any());
        assertEquals("                {\n                    \"name\":\"Name\"\n                },\n",
                actualVisitMoonResult);
    }
}
