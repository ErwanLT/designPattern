package concret.recette;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Recette implements Cloneable {
    private final String nom;
    private final List<Ingredient> ingredients;
    private final List<String> etapes;
    private final TypeRecette typeRecette;

    public Recette(RecetteBuilder recetteBuilder) {
        this.nom = recetteBuilder.nom;
        this.ingredients = recetteBuilder.ingredients;
        this.etapes = recetteBuilder.etapes;
        this.typeRecette = recetteBuilder.typeRecette;
    }

    public Recette(String nom, List<Ingredient> ingredients, List<String> etapes, TypeRecette typeRecette) {
        this.nom = nom;
        this.ingredients = ingredients;
        this.etapes = etapes;
        this.typeRecette = typeRecette;
    }

    @Override
    public Recette clone() {
        return new Recette(this.nom, this.ingredients, this.etapes, this.typeRecette);
    }

    @NoArgsConstructor
    public static class RecetteBuilder{
        private String nom;
        private List<Ingredient> ingredients = new ArrayList<>();
        private List<String> etapes = new ArrayList<>();
        private TypeRecette typeRecette;

        public RecetteBuilder avecNom(String nom){
            this.nom = nom;
            return this;
        }

        public RecetteBuilder avecIngredient(Ingredient ingredient){
            this.ingredients.add(ingredient);
            return this;
        }

        public RecetteBuilder avecEtapes(String etape){
            this.etapes.add(etape);
            return this;
        }

        public RecetteBuilder avecType(TypeRecette type){
            this.typeRecette = type;
            return this;
        }

        public Recette build(){
            return new Recette(this);
        }
    }

    @Override
    public String toString() {
        return "Recette{" +
                "nom='" + nom + '\'' +
                ", typeRecette=" + typeRecette +
                ", ingredients=" + ingredients +
                ", etapes=" + etapes +
                '}';
    }
}
