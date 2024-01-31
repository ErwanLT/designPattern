package structural.facade;

public class FacadeMain {

    public static void main(String[] args) {
        ShapeMaker maker = new ShapeMaker();

        maker.drawCircle();
        maker.drawSquare();
    }
}
