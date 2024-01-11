package main.java.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class AbstractOperationStrategy implements IOperationStrategy {

    private final int a;
    private final int b;

}
