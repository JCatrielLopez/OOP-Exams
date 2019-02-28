package P_07_2018;

public class APIngredientAmount implements AcceptancePolicy {

    String ingredient;
    float amount;

    public APIngredientAmount(String ingredient, float amount){
        this.ingredient = ingredient;
        this.amount = amount;
    }

    @Override
    public boolean accepts(Recipe recipe) {
        if (recipe.contains(ingredient) && recipe.getAmount(ingredient) == this.amount)
            return true;
        else
            return false;
    }
}
