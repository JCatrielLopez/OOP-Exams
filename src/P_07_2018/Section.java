package P_07_2018;

import java.util.ArrayList;
import java.util.HashMap;

public class Section {

    ArrayList<Recipe> recipes;
    AcceptancePolicy acceptance_policy;
    HashMap<Ingredient, Float> stock;

    public Section(){
        this.recipes = new ArrayList<>();
        this.stock = new HashMap<>();
        this.acceptance_policy = null;
    }

    public void setAcceptancePolicy(AcceptancePolicy acceptance_policy){
        this.acceptance_policy = acceptance_policy;
    }

    public boolean takesRecipe(Recipe recipe) {

        if (this.acceptance_policy != null && acceptance_policy.accepts())
            if (this.gotStockFor(recipe)) {
                this.addRecipe(recipe);
                return true;
            }

        return false;
    }

    private boolean gotStockFor(Recipe recipe) {
        HashMap<Ingredient, Float> ingredients = recipe.getIngredients();
        for(Ingredient ingredient: ingredients.keySet())
            if ((this.stock.get(ingredient) - ingredients.get(ingredient)) < 0)
                return false;

        return true;

    }

    private void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);

        HashMap<Ingredient, Float> ingredients = recipe.getIngredients();
        for(Ingredient ingredient: ingredients.keySet())
            this.stock.replace(ingredient, this.stock.get(ingredient) - ingredients.get(ingredient));


    }

    public Integer recipesLeft() {
        return this.recipes.size();
    }
}