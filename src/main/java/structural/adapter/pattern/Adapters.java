package main.java.structural.adapter.pattern;

import main.java.structural.adapter.shape.Round;
import main.java.structural.adapter.shape.Square;

public class Adapters extends Round {

    private Square peg;

    public Adapters(Square peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
