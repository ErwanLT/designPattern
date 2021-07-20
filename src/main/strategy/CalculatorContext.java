package main.strategy;

public class CalculatorContext {

    private IOperationStrategy strategy;

    public CalculatorContext(IOperationStrategy strategy){
        this.strategy = strategy;
    }

    public void compute(){
        this.strategy.compute();
    }
}
