package behavioral.memento;

public class TextEditor {

    private TextWindow textWindow;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void write(String text) {
        textWindow.addText(text);
    }

    public String print() {
        return textWindow.getCurrentText();
    }

    public void hitSave() {
        textWindow.saveAndPush();
    }

    public void hitUndo() {
        textWindow.undo();
    }
}
