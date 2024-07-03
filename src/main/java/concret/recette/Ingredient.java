package concret.recette;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class Ingredient {
    private final String label;
    private final double quantite;
    private final String unite;

    private Ingredient(IngredientBuilder builder){
        this.label = builder.label;
        this.quantite = builder.quantite;
        this.unite = builder.unite;
    }

    @NoArgsConstructor
    public static class IngredientBuilder {
        private String label;
        private double quantite;
        private String unite;

        public IngredientBuilder avecLabel(String label){
            this.label = label;
            return this;
        }

        public IngredientBuilder avecQuantite(double quantite){
            this.quantite = quantite;
            return this;
        }

        public IngredientBuilder avecUnite(String unite){
            this.unite = unite;
            return this;
        }

        public Ingredient build(){
            return new Ingredient(this);
        }
    }

    @Override
    public String toString() {
        return quantite + " " + unite + " de " + label;
    }
}
