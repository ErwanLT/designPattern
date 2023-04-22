package main.java.factory;

public class FactoryMain {

    public static void main(String[] args) {
        Celestial planet = CelestialFactory.getCelestial("PLANET");
        System.out.println(planet.canHaveNaturalSatellite());

        Celestial star = CelestialFactory.getCelestial("STAR");
        System.out.println(star.canHaveNaturalSatellite());

        Celestial manMadeSatellite = CelestialFactory.getCelestial("STARLINK");
        System.out.println(manMadeSatellite.canHaveNaturalSatellite());
    }
}
