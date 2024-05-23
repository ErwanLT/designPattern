package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Famille implements Personne {
    private Personne conjoint1;
    private Personne conjoint2;
    private List<Personne> enfants;

    public Famille(Personne conjoint1, Personne conjoint2) {
        this.conjoint1 = conjoint1;
        this.conjoint2 = conjoint2;
        this.enfants = new ArrayList<>();
    }

    @Override
    public void afficher(int niveau) {
        String indentation = " ".repeat(niveau * 4);
        System.out.println(indentation + "Famille:");
        System.out.println(indentation + "  Conjoints:");
        conjoint1.afficher(niveau + 2);
        conjoint2.afficher(niveau + 2);
        System.out.println(indentation + "  Enfants:");
        for (Personne enfant : enfants) {
            enfant.afficher(niveau + 2);
        }
    }

    @Override
    public void ajouterEnfant(Personne enfant) {
        enfants.add(enfant);
    }

    @Override
    public void ajouterConjoint(Personne conjoint) {
        throw new UnsupportedOperationException("Une famille ne peut pas ajouter de conjoint.");
    }

    @Override
    public List<Personne> getEnfants() {
        return enfants;
    }

    @Override
    public Personne getConjoint() {
        throw new UnsupportedOperationException("Une famille ne peut pas avoir un conjoint unique.");
    }

    @Override
    public String getNom() {
        return conjoint1.getNom() + " & " + conjoint2.getNom();
    }

    @Override
    public int getAge() {
        throw new UnsupportedOperationException("Une famille n'a pas un âge unique.");
    }

    @Override
    public String getSexe() {
        throw new UnsupportedOperationException("Une famille n'a pas un sexe unique.");
    }
}

