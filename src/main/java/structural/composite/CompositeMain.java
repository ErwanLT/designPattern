package structural.composite;

public class CompositeMain {
    public static void main(String[] args) {
        Personne philippe = new Individu("Philippe", 62, "Homme");
        Personne isabelle = new Individu("Isabelle", 57, "Femme");
        Famille grandsParents = new Famille(philippe, isabelle);

        Personne erwan = new Individu("Erwan", 33, "Homme");
        Personne amelie = new Individu("Amélie", 34, "Femme");
        Famille familleParent1 = new Famille(erwan, amelie);

        Personne alan = new Individu("Alan", 30, "Homme");
        Personne katell = new Individu("Katell", 27, "Femme");

        Personne mathys = new Individu("Mathys", 5, "Homme");


        familleParent1.ajouterEnfant(mathys);
        grandsParents.ajouterEnfant(familleParent1);
        grandsParents.ajouterEnfant(alan);
        grandsParents.ajouterEnfant(katell);

        System.out.println("Arbre généalogique des grands-parents:");
        grandsParents.afficher(0);

    }
}
