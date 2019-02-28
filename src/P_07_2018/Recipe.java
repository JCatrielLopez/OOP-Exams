package P_07_2018;

import java.util.HashMap;

public class Recipe extends Ingredient{

    HashMap<Ingredient, Float> ingredients;

    public HashMap<Ingredient, Float> getIngredients() {
        return (HashMap<Ingredient, Float>) this.ingredients.clone();
    }

    public boolean contains(Ingredient ingredient) {
        return this.ingredients.keySet().contains(ingredient);
    }

    public Float getAmount(Ingredient ingredient) {
        if (this.contains(ingredient))
            return this.ingredients.get(ingredient);
        else
            return 0f;
    }
}
