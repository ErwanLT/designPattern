package test.java.memento;

import main.java.behavioral.memento.TextEditor;
import main.java.behavioral.memento.TextWindow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MementoTest {

    @Test
    public void MementoTest(){
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("The Memento Design Pattern\n");
        textEditor.write("How to implement it in Java?\n");
        textEditor.hitSave();
        textEditor.write("Buy milk and eggs before coming home\n");
        textEditor.hitUndo();

        Assertions.assertEquals("The Memento Design Pattern\nHow to implement it in Java?\n", textEditor.print());
    }
}
