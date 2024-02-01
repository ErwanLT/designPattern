package behavioral.strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class StrategyTest {

    /**
     * Method under test: {@link CalculatorContext#executeOperation()}
     */
    @Test
    void testExecuteOperation() {
        // Arrange
        IOperationStrategy operationStrategy = mock(IOperationStrategy.class);
        when(operationStrategy.compute()).thenReturn(1);

        CalculatorContext calculatorContext = new CalculatorContext();
        calculatorContext.setOperationStrategy(operationStrategy);

        // Act
        int actualExecuteOperationResult = calculatorContext.executeOperation();

        // Assert
        verify(operationStrategy).compute();
        assertEquals(1, actualExecuteOperationResult);
    }
}
