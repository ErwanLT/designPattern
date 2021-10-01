package test.java.mediator;

import main.java.mediator.User;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MediatorPatternTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void init(){
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void reset(){
        System.setOut(originalOut);
    }

    @Test
    public void mediatorTest(){
        User robert = new User("Robert");
        robert.sendMessage("Hi! John!");

        Assertions.assertTrue(outContent.toString().contains("Hi! John!"));
    }
}
