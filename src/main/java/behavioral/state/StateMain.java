package behavioral.state;

public class StateMain {
    public static void main(String[] args){
        Document document = new Document();

        // Affichage du document vide
        document.display();

        // Insertion de texte dans le document
        document.insertText("Smoothie mangue / fruit du dragon");
        document.insertText(
                """
                Complexité : *
                Pour : 2 personnes
                Temps de préparation : 5 minutes
                Ingrédients :
                    - 2 fruits du dragon
                    - 1 mangue
                    - 25cl de lait de coco
                    - 1g de wasabi
                Préparation :
                    1. Epluchez la mangue et mettre la chair dans un mixeur
                    2. Coupez les chapeaux des fruits du dragon et évidez-les, réservez les coques. Mettre la chair dans le mixeur.
                    3. Dans le mixeur rajoutez le lait de coco et le wasabi, puis mixez.
                    4. Versez dans les fruits du dragons évidés et dégusté.
                """);

        // Affichage du document non vide
        document.display();

        // Sauvegarde du document
        document.save();
    }
}
