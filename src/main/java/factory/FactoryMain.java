package main.java.factory;

public class FactoryMain {

    public static void main(String[] args) {
        Celestial celestial1 = CelestialFactory.getCelestial("PLANET");
        System.out.println(celestial1.canHaveNaturalSatellite());

        Celestial celestial2 = CelestialFactory.getCelestial("STAR");
        System.out.println(celestial2.canHaveNaturalSatellite());

        Celestial celestial3 = CelestialFactory.getCelestial("STARLINK");
        System.out.println(celestial3.canHaveNaturalSatellite());
    }
}
