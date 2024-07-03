package concret;

import concret.recette.Recette;
import lombok.Getter;

import java.util.List;

@Getter
public class LivreState {
    private List<Recette> recettes;

    public LivreState(List<Recette> recettes) {
        this.recettes = recettes;
    }
}
