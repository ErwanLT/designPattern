package structural.facade;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class FacadeTest {
    /**
     * Method under test: {@link ShapeMaker#drawCircle()}
     */
    @Test
    void testDrawCircle() {
        // Arrange
        ShapeMaker shapeMaker = new ShapeMaker();

        // Act
        shapeMaker.drawCircle();

        // Assert that nothing has changed
        assertInstanceOf(Circle.class, shapeMaker.getCircle());
        assertInstanceOf(Square.class, shapeMaker.getSquare());
    }

    /**
     * Method under test: {@link ShapeMaker#drawSquare()}
     */
    @Test
    void testDrawSquare() {
        // Arrange
        ShapeMaker shapeMaker = new ShapeMaker();

        // Act
        shapeMaker.drawSquare();

        // Assert that nothing has changed
        assertInstanceOf(Circle.class, shapeMaker.getCircle());
        assertInstanceOf(Square.class, shapeMaker.getSquare());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ShapeMaker#getCircle()}
     *   <li>{@link ShapeMaker#getSquare()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        ShapeMaker shapeMaker = new ShapeMaker();

        // Act
        Shape actualCircle = shapeMaker.getCircle();

        // Assert
        assertInstanceOf(Circle.class, actualCircle);
        assertInstanceOf(Square.class, shapeMaker.getSquare());
    }

    /**
     * Method under test: default or parameterless constructor of {@link ShapeMaker}
     */
    @Test
    void testNewShapeMaker() {
        // Arrange and Act
        ShapeMaker actualShapeMaker = new ShapeMaker();

        // Assert
        assertInstanceOf(Circle.class, actualShapeMaker.getCircle());
        assertInstanceOf(Square.class, actualShapeMaker.getSquare());
    }
}
