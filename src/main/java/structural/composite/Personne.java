package structural.composite;

import java.util.List;

public interface Personne {
    void afficher(int niveau);
    void ajouterEnfant(Personne enfant);
    void ajouterConjoint(Personne conjoint);
    List<Personne> getEnfants();
    Personne getConjoint();
    String getNom();
    int getAge();
    String getSexe();
}
