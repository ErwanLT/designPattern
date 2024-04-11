package behavioral.interpretor.expressions.impl.compute;

import behavioral.interpretor.expressions.Expression;

public abstract class ComputeExpression<T> implements Expression<T> {
    protected Expression<T> left;
    protected Expression<T> right;

    public ComputeExpression(Expression<T> left, Expression<T> right) {
        this.left = left;
        this.right = right;
    }
}
