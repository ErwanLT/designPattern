package behavioral.visitor.models.impl;

import behavioral.visitor.models.SpaceElement;
import behavioral.visitor.visitors.Visitor;

public class Moon implements SpaceElement {
    private String name;

    public Moon(String name) {
        this.name = name;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitMoon(this);
    }

    public String getName() {
        return name;
    }
}
