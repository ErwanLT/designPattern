package test.java.facade;

import main.java.structural.facade.Circle;
import main.java.structural.facade.Shape;
import main.java.structural.facade.ShapeMaker;
import main.java.structural.facade.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacadeTest {

    private ShapeMaker shapeMaker;

    @BeforeEach
    public void init(){
        shapeMaker = new ShapeMaker();
    }

    @Test
    public void testFacadePattern(){
        Shape circle = shapeMaker.getCircle();
        Shape square = shapeMaker.getSquare();
        Assertions.assertTrue(circle instanceof Circle);
        Assertions.assertTrue(square instanceof Square);
    }
}
