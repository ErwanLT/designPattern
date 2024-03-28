package behavioral.visitor.models;

import behavioral.visitor.visitors.Visitor;

public interface SpaceElement {
    String accept(Visitor visitor);
}
