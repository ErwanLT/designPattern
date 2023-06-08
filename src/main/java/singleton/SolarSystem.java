package main.java.singleton;

public class SolarSystem {

    public static void main(String[] args) {
        Sun sun = Sun.getInstance();

        Planet earth = new Planet("Earth");
        earth.orbit(sun);

        Planet mars = new Planet("Mars");
        mars.orbit(sun);
    }
}
