package structural.adapter;

import structural.adapter.hole.RoundHole;
import structural.adapter.pattern.Adapters;
import structural.adapter.shape.Round;
import structural.adapter.shape.Square;

public class AdapterMain {

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        Round rpeg = new Round(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        Square smallSqPeg = new Square(2);
        Square largeSqPeg = new Square(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        Adapters smallSqPegAdapter = new Adapters(smallSqPeg);
        Adapters largeSqPegAdapter = new Adapters(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
