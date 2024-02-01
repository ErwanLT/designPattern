package behavioral.command;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import behavioral.command.actions.ActionListenerCommand;
import org.junit.jupiter.api.Test;

class CommandTest {
    /**
     * Method under test: {@link MenuOptions#clickOpen()}
     */
    @Test
    void testClickOpen() {
        // Arrange
        ActionListenerCommand resultOpen = mock(ActionListenerCommand.class);
        doNothing().when(resultOpen).execute();

        // Act
        (new MenuOptions(resultOpen, mock(ActionListenerCommand.class))).clickOpen();

        // Assert that nothing has changed
        verify(resultOpen).execute();
    }

    /**
     * Method under test: {@link MenuOptions#clickSave()}
     */
    @Test
    void testClickSave() {
        // Arrange
        ActionListenerCommand save = mock(ActionListenerCommand.class);
        doNothing().when(save).execute();

        // Act
        (new MenuOptions(mock(ActionListenerCommand.class), save)).clickSave();

        // Assert that nothing has changed
        verify(save).execute();
    }
}
