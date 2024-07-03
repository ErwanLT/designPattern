package concret.strat;

import concret.recette.Recette;

import java.util.Comparator;
import java.util.List;

public class TriParNombreIngredients implements StrategieTri {
    @Override
    public void trier(List<Recette> recettes) {
        recettes.sort(Comparator.comparingInt(r -> r.getIngredients().size()));
    }
}