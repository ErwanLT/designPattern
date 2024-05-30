package structural.decorator;

public class SimpleCoffee implements Coffee{
    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getDescription() {
        return "Un café classique";
    }
}
