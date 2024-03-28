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
        sb.append(indent()).append("    <planet>\n");
        sb.append(indent()).append("        <name>").append(planet.getName()).append("</name>\n");
        sb.append(indent()).append("        <moons number=").append(planet.getMoons().size()).append(">\n");
        level++;
        planet.getMoons().forEach( e-> {
            var rep = e.accept(this);
            sb.append(rep);
        });
        level--;
        sb.append(indent()).append("        </moons>\n");
        sb.append(indent()).append("    </planet>\n");
        return sb.toString();
    }

    @Override
    public String visitStar(Star star) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent()).append("<star>\n");
        sb.append(indent()).append("    <name>").append(star.getName()).append("</name>\n");
        sb.append(indent()).append("    <planets number=").append(star.getOrbitalPlanets().size()).append(">\n");
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
        return indent() + "        <moon>\n" +
                indent() + "            <name>" + moon.getName() + "</name>\n" +
                indent() + "        </moon>\n";
    }

    public String getXmlRepresentation(SpaceElement element) {
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<solar_system>\n" +
                element.accept(this) +
                "</solar_system>";
    }

    private String indent() {
        return "    ".repeat(Math.max(0, level));
    }
}
