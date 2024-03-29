package structural.adapter.pattern;

import structural.adapter.shape.Round;
import structural.adapter.shape.Square;

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
