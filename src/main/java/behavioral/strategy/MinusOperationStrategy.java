package behavioral.strategy;

public final class MinusOperationStrategy extends AbstractOperationStrategy{

    public MinusOperationStrategy(int a, int b){
        super(a, b);
    }

    @Override
    public int compute() {
        return getA() - getB();
    }
}
