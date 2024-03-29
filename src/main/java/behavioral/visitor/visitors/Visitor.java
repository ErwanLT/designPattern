package behavioral.visitor.visitors;

import behavioral.visitor.models.SpaceElement;
import behavioral.visitor.models.impl.Moon;
import behavioral.visitor.models.impl.Planet;
import behavioral.visitor.models.impl.Star;

public interface Visitor {
    String visitPlanet(Planet planet);
    String visitStar(Star star);
    String visitMoon(Moon moon);
    String getRepresentation(SpaceElement element);
}
