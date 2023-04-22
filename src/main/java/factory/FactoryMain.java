package main.java.factory;

public class FactoryMain {

    public static void main(String[] args) {
        CelestialFactory factory = new CelestialFactory();
        Celestial celestial1 = factory.getCelestial("PLANET");
        System.out.println(celestial1.canHaveNaturalSatellite());

        Celestial celestial2 = factory.getCelestial("STAR");
        System.out.println(celestial2.canHaveNaturalSatellite());

        Celestial celestial3 = factory.getCelestial("STARLINK");
        System.out.println(celestial3.canHaveNaturalSatellite());
    }
}
