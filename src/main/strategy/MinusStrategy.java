package main.strategy;

public final class MinusStrategy extends AbstractOperationStrategy{

    public MinusStrategy(int a, int b){
        super(a, b);
    }

    @Override
    public void compute() {
        System.out.println(getA() - getB());
    }
}
