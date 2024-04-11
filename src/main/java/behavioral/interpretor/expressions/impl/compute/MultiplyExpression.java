package behavioral.interpretor.expressions.impl.compute;

import behavioral.interpretor.expressions.Expression;

public class MultiplyExpression extends ComputeExpression<Integer>{
    public MultiplyExpression(Expression<Integer> left, Expression<Integer> right) {
        super(left, right);
    }

    @Override
    public Integer interpret() {
        return left.interpret() * right.interpret();
    }
}
