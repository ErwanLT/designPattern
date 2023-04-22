package main.java.factory;

import java.util.Objects;

public class CelestialFactory {

    public Celestial getCelestial(String type){
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
