package F_26_02_2016;

import F_03_09_2014.Section;

import java.util.ArrayList;

public class Category extends WebContent{

    ArrayList<Section> sections;

    public Category(String description, Image image, ArrayList<Section> sections) {
        this.description = description;
        this.image = image;
        this.sections = sections;
    }

    public void addSection(Section s){
        this.sections.add(s);
    }

    public void removeSection(Section s){
        this.sections.remove(s);
    }

    public ArrayList<Section> getSections() {
        return sections;
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }

}
