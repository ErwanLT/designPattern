package main.java.factory;

public class Star implements Celestial {
    @Override
    public String canHaveNaturalSatellite() {
        return "Stars can have natural Satellite";
    }
}
