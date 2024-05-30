package structural.decorator;

import structural.decorator.decorators.MilkDecorator;
import structural.decorator.decorators.SugarDecorator;

public class DecoratorMain {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " €" + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " €" + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " €" + coffee.getCost());
    }
}
