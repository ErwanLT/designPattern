package behavioral.visitor;

import behavioral.visitor.models.SpaceElement;
import behavioral.visitor.models.impl.Moon;
import behavioral.visitor.models.impl.Planet;
import behavioral.visitor.models.impl.Star;
import behavioral.visitor.visitors.Visitor;
import behavioral.visitor.visitors.impl.JsonVisitor;
import behavioral.visitor.visitors.impl.XmlVisitor;

public class VisitorMain {
    public static void main(String[] args) {
        Star sun = new Star("Sun");
        Planet earth = new Planet("Earth");
        Moon moon = new Moon("Moon");
        earth.addMoon(moon);
        Planet mars = new Planet("Mars");
        Moon phobos = new Moon("Phobos");
        Moon deimos = new Moon("Deimos");
        mars.addMoon(phobos);
        mars.addMoon(deimos);
        sun.addPlanet(earth);
        sun.addPlanet(mars);

        Visitor xmlVisitor = new XmlVisitor();
        sun.accept(xmlVisitor);
        earth.accept(xmlVisitor);
        mars.accept(xmlVisitor);
        export(xmlVisitor, sun);

        Visitor jsonVisitor = new JsonVisitor();
        sun.accept(jsonVisitor);
        earth.accept(jsonVisitor);
        mars.accept(jsonVisitor);
        export(jsonVisitor, sun);
    }

    private static void export(Visitor visitor, SpaceElement element){
        System.out.println(visitor.getRepresentation(element)+"\n");
    }
}
