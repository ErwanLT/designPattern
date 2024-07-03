package concret.strat;

import concret.recette.Recette;

import java.util.Comparator;
import java.util.List;

public class TriParNom implements StrategieTri {
    @Override
    public void trier(List<Recette> recettes) {
        recettes.sort(Comparator.comparing(Recette::getNom));
    }
}