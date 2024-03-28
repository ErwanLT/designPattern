package behavioral.visitor.visitors.impl;

import behavioral.visitor.models.SpaceElement;
import behavioral.visitor.models.impl.Moon;
import behavioral.visitor.models.impl.Planet;
import behavioral.visitor.models.impl.Star;
import behavioral.visitor.visitors.Visitor;

public class XmlVisitor implements Visitor {

    private int level = 1;

    @Override
    public String visitPlanet(Planet planet) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent()).append("<planet>\n");
        sb.append(indent()).append("    <name>").append(planet.getName()).append("</name>\n");
        sb.append(indent()).append("    <moons>\n");
        level++;
        planet.getMoons().forEach( e-> {
            var rep = e.accept(this);
            sb.append(rep);
        });
        level--;
        sb.append(indent()).append("    </moons>\n");
        sb.append(indent()).append("</planet>\n");
        return sb.toString();
    }

    @Override
    public String visitStar(Star star) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent()).append("<star>\n");
        sb.append(indent()).append("    <name>").append(star.getName()).append("</name>\n");
        sb.append(indent()).append("    <planets>\n");
        level++;
        star.getOrbitalPlanets().forEach(e -> {
            var rep = e.accept(this);
            sb.append(rep);
        });
        level--;
        sb.append(indent()).append("    </planets>\n");
        sb.append(indent()).append("</star>\n");
        return sb.toString();
    }

    @Override
    public String visitMoon(Moon moon) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent()).append("<moon>\n");
        sb.append(indent()).append("    <name>").append(moon.getName()).append("</name>\n");
        sb.append(indent()).append("</moon>\n");
        return sb.toString();
    }

    public String getXmlRepresentation(SpaceElement element) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
        sb.append("<solar_system>\n");
        sb.append(element.accept(this));
        sb.append("</solar_system>");
        return sb.toString();
    }

    private String indent() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) {
            sb.append("    ");
        }
        return sb.toString();
    }
}
