package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Individu implements Personne {
    private String nom;
    private int age;
    private String sexe;

    public Individu(String nom, int age, String sexe) {
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;
    }

    @Override
    public void afficher(int niveau) {
        String indentation = " ".repeat(niveau * 4);
        System.out.println(indentation + nom + ", " + age + " ans, " + sexe);
    }

    @Override
    public void ajouterEnfant(Personne enfant) {
        // Un individu simple ne peut pas avoir d'enfants directement.
        throw new UnsupportedOperationException("Un individu simple ne peut pas avoir d'enfants.");
    }

    @Override
    public void ajouterConjoint(Personne conjoint) {
        // Un individu simple ne peut pas avoir de conjoint directement.
        throw new UnsupportedOperationException("Un individu simple ne peut pas avoir de conjoint.");
    }

    @Override
    public List<Personne> getEnfants() {
        return new ArrayList<>(); // Un individu simple n'a pas d'enfants.
    }

    @Override
    public Personne getConjoint() {
        return null; // Un individu simple n'a pas de conjoint.
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getSexe() {
        return sexe;
    }
}

