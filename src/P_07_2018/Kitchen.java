package P_07_2018;

import java.util.ArrayList;

public class Kitchen {

    ArrayList<Section> sections;

    public Kitchen(){
        this.sections = new ArrayList<>();
    }

    public void addSection(Section section){
        this.sections.add(section);
    }

    public void removeSection(Section section){
        this.sections.remove(section);
    }

    public boolean takeOrder(Recipe order){

        for(Section section: this.sections)
            if (section.takesRecipe(order))
                return true;

        return false;
    }

    public boolean takeOrder(ArrayList<Recipe> order){

        boolean taken;
        for(Recipe recipe: order) {
            taken = takeOrder(recipe);

            if (!taken){
                return false;
            }
        }
        return true;
    }







}
