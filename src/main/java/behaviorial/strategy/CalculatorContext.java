package main.java.behaviorial.strategy;

public class CalculatorContext {

    private IOperationStrategy strategy;

    public void setOperationStrategy(IOperationStrategy operationStrategy) {
        this.strategy = operationStrategy;
    }

    public int executeOperation(){
        return this.strategy.compute();
    }
}
