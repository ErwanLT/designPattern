package creation.factory;

import creation.factory.model.Celestial;
import creation.factory.model.impl.ManMadeSatellite;
import creation.factory.model.impl.Planet;
import creation.factory.model.impl.Star;

import java.util.Objects;

public class CelestialFactory {

    public static Celestial getCelestial(String type){
        if(Objects.isNull(type)){
            return null;
        }
        if("PLANET".equals(type)){
            return new Planet();
        } else if ("STAR".equals(type)) {
            return new Star();
        } else {
            return new ManMadeSatellite();
        }
    }
}
