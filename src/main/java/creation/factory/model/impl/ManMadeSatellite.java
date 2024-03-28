package creation.factory.model.impl;

import creation.factory.model.Celestial;

public class ManMadeSatellite implements Celestial {
    @Override
    public String canHaveNaturalSatellite() {
        return "A man made satellite can't have natural satellite";
    }
}
