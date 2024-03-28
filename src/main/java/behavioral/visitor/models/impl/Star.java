package behavioral.visitor.models.impl;


import behavioral.visitor.models.SpaceElement;
import behavioral.visitor.visitors.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Star implements SpaceElement {
    private String name;

    private List<SpaceElement> orbitalPlanets;

    public Star(String name) {
        this.name = name;
        this.orbitalPlanets = new ArrayList<>();
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitStar(this);
    }

    public void addPlanet(SpaceElement planet){
        orbitalPlanets.add(planet);
    }

    public List<SpaceElement> getOrbitalPlanets() {
        return orbitalPlanets;
    }

    public String getName() {
        return name;
    }
}
