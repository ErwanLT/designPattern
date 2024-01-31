package creation.factory;

public class Planet implements Celestial {
    @Override
    public String canHaveNaturalSatellite() {
        return "A planet can have natural satellite";
    }
}
