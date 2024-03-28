package behavioral.visitor.models.impl;

import behavioral.visitor.models.SpaceElement;
import behavioral.visitor.visitors.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Planet implements SpaceElement {
    private String name;
    private List<SpaceElement> moons;

    public Planet(String name) {
        this.name = name;
        this.moons = new ArrayList<>();
    }

    public void addMoon(SpaceElement moon) {
        moons.add(moon);
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitPlanet(this);
    }

    public List<SpaceElement> getMoons() {
        return moons;
    }

    public String getName() {
        return name;
    }
}
