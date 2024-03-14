package behavioral.state;

public interface DocumentState {
    void display();
    void insertText(String text);
    void save();
}
