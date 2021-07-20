package main.strategy;

public class StrategyMain {

    public static void main(String[] args) {

        CalculatorContext ctx = new CalculatorContext(new PlusStrategy(2, 3));
        ctx.compute();

        ctx = new CalculatorContext(new MinusStrategy(2, 3));
        ctx.compute();

    }
}
