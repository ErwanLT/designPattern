package main.java.structural.adapter.hole;

import main.java.structural.adapter.shape.Round;

public class RoundHole {

    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(Round peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
