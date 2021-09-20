package main.java.facade;

public class ShapeMaker {

    private Shape square;
    private Shape circle;

    public ShapeMaker(){
        square = new Square();
        circle = new Circle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

    public Shape getCircle() {
        return circle;
    }

    public Shape getSquare() {
        return square;
    }
}
