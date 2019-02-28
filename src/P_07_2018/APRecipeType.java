package P_07_2018;

public class APRecipeType implements AcceptancePolicy {

    String type;
    Recipe recipe;

    public APRecipeType(String type, Recipe recipe){
        this.type = type;
        this.recipe = recipe;
    }

    @Override
    public boolean accepts() {
        return this.type.equals(this.recipe.get("type"));
    }
}
