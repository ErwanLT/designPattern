package behavioral.visitor.visitors.impl;

import behavioral.visitor.models.SpaceElement;
import behavioral.visitor.models.impl.Moon;
import behavioral.visitor.models.impl.Planet;
import behavioral.visitor.models.impl.Star;
import behavioral.visitor.visitors.Visitor;

public class XmlVisitor implements Visitor {

    @Override
    public String visitPlanet(Planet planet) {
        return """
                <planet>
                    <name>%s</name>
                    <moons>%d</moons>
                <planet>
                """.formatted(planet.getName(), planet.getMoons().size());
    }

    @Override
    public String visitStar(Star star) {
        return """
                <star>
                    <name>%s</name>
                    <planets>%d</planets>
                </star>
                """.formatted(star.getName(), star.getOrbitalPlanets().size());
    }

    @Override
    public String visitMoon(Moon moon) {
        return """
                <moon>
                    <name>%s</name>
                </moon>
                """.formatted(moon.getName());
    }

    public String getXmlRepresentation(SpaceElement... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
        sb.append("<solar_system>\n");
        for (SpaceElement element : args) {
            sb.append(element.accept(this));
        }
        sb.append("</solar_system>");
        return sb.toString();
    }
}
