package F_26_02_2016;

import java.util.ArrayList;

public class Website implements ContentRestriction{

    ArrayList<Category> categories;

    public Website(){
        this.categories = new ArrayList<>();
    }

    public ContentRestriction restrictContent(String keyword){
        ArrayList<Category> categories= new ArrayList<>();

        for(Category category: categories){
            categories.add((Category) category.restrictContent(keyword));
        }

        if (categories.size() != 0) {
            Website result = new Website();
            result.addCategories(categories);

            return result;
        }
        else
            return null;
    }

    private void addCategories(ArrayList<Category> categories) {
        this.categories = (ArrayList<Category>) categories.clone();
    }

}
