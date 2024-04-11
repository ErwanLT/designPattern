package behavioral.interpretor.expressions.impl.compute;

import behavioral.interpretor.expressions.Expression;

public class NumberExpression implements Expression<Integer> {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public Integer interpret() {
        return number;
    }
}
