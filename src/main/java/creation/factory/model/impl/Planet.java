package creation.factory.model.impl;

import creation.factory.model.Celestial;

public class Planet implements Celestial {
    @Override
    public String canHaveNaturalSatellite() {
        return "A planet can have natural satellite";
    }
}
