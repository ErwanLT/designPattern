package behavioral.mediator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MediatorTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    /**
     * Method under test: {@link ChatRoom#showMessage(User, String)}
     */
    @Test
    void testShowMessage() {
        // Arrange
        User user = new User("Name");

        // Act
        ChatRoom.showMessage(user, "Not all who wander are lost");

        // Assert that nothing has changed
        assertEquals("Name", user.getName());
        assertTrue(outputStreamCaptor.toString().contains("[Name] : Not all who wander are lost"));
    }
}
