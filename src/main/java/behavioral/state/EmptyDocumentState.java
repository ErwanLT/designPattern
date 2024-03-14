package behavioral.state;

public class EmptyDocumentState implements DocumentState{
    private Document document;

    public EmptyDocumentState(Document document) {
        this.document = document;
    }

    @Override
    public void display() {
        System.out.println("Le document est vide.");
    }

    @Override
    public void insertText(String text) {
        System.out.println("Le document n'est plus vide, on change d'état");
        document.setState(new NonEmptyDocumentState(document, text));
    }

    @Override
    public void save() {
        System.out.println("Impossible de sauvegarder : le document est vide.");
    }
}
