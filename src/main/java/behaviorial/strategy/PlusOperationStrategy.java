package main.java.behaviorial.strategy;

public final class PlusOperationStrategy extends AbstractOperationStrategy {

    public PlusOperationStrategy(int a, int b){
        super(a, b);
    }

    @Override
    public int compute() {
        return getA() + getB();
    }
}
