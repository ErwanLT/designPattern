package test.java.adapter;

import main.java.adapter.hole.RoundHole;
import main.java.adapter.pattern.Adapters;
import main.java.adapter.shape.Round;
import main.java.adapter.shape.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    public void adapterTest() {
        RoundHole hole = new RoundHole(5);

        Round rpeg = new Round(5);
        Square smallSqPeg = new Square(2);
        Square largeSqPeg = new Square(20);

        Assertions.assertTrue(hole.fits(rpeg));

        Adapters smallSqPegAdapter = new Adapters(smallSqPeg);
        Adapters largeSqPegAdapter = new Adapters(largeSqPeg);
        Assertions.assertTrue(hole.fits(smallSqPegAdapter));
        Assertions.assertFalse(hole.fits(largeSqPegAdapter));
    }
}
