package behavioral.state;

public class NonEmptyDocumentState implements DocumentState{
    private Document document;
    private StringBuilder content;

    public NonEmptyDocumentState(Document document, String initialContent) {
        this.document = document;
        this.content = new StringBuilder(initialContent);
    }

    @Override
    public void display() {
        System.out.println("Contenu du document : \n" + content.toString());
    }

    @Override
    public void insertText(String text) {
        content.append(text);
    }

    @Override
    public void save() {
        System.out.println("Sauvegarde du document...");
        // Implémentation de la logique de sauvegarde
    }
}
