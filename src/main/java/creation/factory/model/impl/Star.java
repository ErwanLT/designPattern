package creation.factory.model.impl;

import creation.factory.model.Celestial;

public class Star implements Celestial {
    @Override
    public String canHaveNaturalSatellite() {
        return "Stars can have natural Satellite";
    }
}
