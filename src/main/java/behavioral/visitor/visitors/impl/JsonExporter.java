package behavioral.visitor.visitors.impl;

import behavioral.visitor.models.SpaceElement;
import behavioral.visitor.models.impl.Moon;
import behavioral.visitor.models.impl.Planet;
import behavioral.visitor.models.impl.Star;
import behavioral.visitor.visitors.Visitor;

public class JsonExporter implements Visitor {

    private int level = 1;

    @Override
    public String visitStar(Star star) {
        StringBuilder sb = new StringBuilder();
        level++;
        sb.append(indent()).append("\"star\":{\n")
                .append(indent()).append("    \"name\":\"").append(star.getName()).append("\",\n")
                .append(indent()).append("    \"planets\":[\n");
        star.getOrbitalPlanets().forEach(e -> {
            var rep = e.accept(this);
            sb.append(rep);
        });
        sb.append(indent()).append("    ]\n")
            .append(indent()).append("}\n");
        level--;
        return sb.toString();
    }

    @Override
    public String visitPlanet(Planet planet) {
        level++;
        StringBuilder sb = new StringBuilder()
                .append(indent()).append("    {\n")
                .append(indent()).append("        \"name\":\"").append(planet.getName()).append("\",\n")
                .append(indent()).append("        \"moons\":[\n");
        planet.getMoons().forEach(e -> {
            var rep = e.accept(this);
            sb.append(rep);
        });
        sb.append(indent()).append("        ]\n")
                .append(indent()).append("    },\n");

        level--;
        return sb.toString();
    }

    @Override
    public String visitMoon(Moon moon) {
        level++;
        StringBuilder sb = new StringBuilder()
                .append(indent()).append("        {\n")
                .append(indent()).append("            \"name\":\"").append(moon.getName()).append("\"\n")
                .append(indent()).append("        },\n");
        level--;
        return sb.toString();
    }

    public String getRepresentation(SpaceElement element) {
        return "{\n"+
                indent()+"\"solar_system\":{\n"+
                element.accept(this) +
                indent()+"}\n"+
                "}";
    }

    private String indent() {
        return "    ".repeat(Math.max(0, level));
    }
}
