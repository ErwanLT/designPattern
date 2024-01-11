package main.java.creation.singleton;

public class Planet {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void orbit(Sun sun) {
        System.out.println(name + " is orbiting around " + sun.getName());
    }
}
