package main.java.behaviorial.strategy;

public class StrategyMain {

    public static void main(String[] args) {

        CalculatorContext ctx = new CalculatorContext();
        ctx.setOperationStrategy(new PlusOperationStrategy(2, 3));
        System.out.println(ctx.executeOperation());

        ctx.setOperationStrategy(new MinusOperationStrategy(2, 3));
        System.out.println(ctx.executeOperation());

    }
}
