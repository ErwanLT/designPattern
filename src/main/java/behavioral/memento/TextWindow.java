package behavioral.memento;

import java.util.Stack;

public class TextWindow {

    private StringBuilder currentText;

    private Stack<TextWindowState> history;

    public TextWindow() {
        this.currentText = new StringBuilder();
        this.history = new Stack<>();
    }

    public String getCurrentText() {
        return currentText.toString();
    }

    public void addText(String text) {
        currentText.append(text);
    }

    public TextWindowState save() {
        return new TextWindowState(currentText.toString());
    }

    public void restore(TextWindowState save) {
        currentText = new StringBuilder(save.getText());
    }

    public void undo() {
        if (!history.isEmpty()) {
            TextWindowState previousState = history.pop();
            restore(previousState);
        }
    }

    public void saveAndPush() {
        history.push(save());
    }
}
