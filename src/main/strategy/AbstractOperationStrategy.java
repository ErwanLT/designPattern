package main.strategy;

public abstract class AbstractOperationStrategy implements IOperationStrategy {

    private final int a;
    private final int b;

    public AbstractOperationStrategy(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
