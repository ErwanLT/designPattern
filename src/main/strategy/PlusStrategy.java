package main.strategy;

public final class PlusStrategy extends AbstractOperationStrategy {


    public PlusStrategy(int a, int b){
        super(a, b);
    }

    @Override
    public void compute() {
        System.out.println(getA() + getB());
    }
}
