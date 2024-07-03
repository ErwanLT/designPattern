package concret;

import concret.recette.Recette;
import concret.strat.StrategieTri;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Livre {
    private static Livre instance;

    private List<Recette> recettes;

    private Stack<LivreState> history;

    private Livre() {
        recettes = new ArrayList<>();
    }

    public static Livre getInstance() {
        if (instance == null) {
            instance = new Livre();
        }
        return instance;
    }

    public void ajouterRecette(Recette recette) {
        System.out.println("Ajout d'une recette "+ recette);
        recettes.add(recette);
        save();
    }

    public List<Recette> getRecettes() {
        return recettes;
    }

    public LivreState save() {
        System.out.println("Sauvegarde livre de recette");
        return new LivreState(recettes);
    }

    public void restore(LivreState save) {
        recettes = save.getRecettes();
    }

    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("Annulation ajout recette");
            LivreState previousState = history.pop();
            restore(previousState);
        }
    }

    public void saveAndPush() {
        history.push(save());
    }

    public void trierRecettes(StrategieTri strategie) {
        strategie.trier(recettes);
    }
}
