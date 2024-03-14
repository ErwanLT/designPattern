package behavioral.state;

public class Document {
    private DocumentState state;

    public Document() {
        this.state = new EmptyDocumentState(this);
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void display() {
        state.display();
    }

    public void insertText(String text) {
        state.insertText(text);
    }

    public void save() {
        state.save();
    }
}
