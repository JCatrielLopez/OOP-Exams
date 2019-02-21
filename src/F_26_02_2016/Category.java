package F_26_02_2016;

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

    @Override
    public Integer amountOfNews() {
        Integer out = 0;
        for(Section section: sections)
            out += section.amountOfNews();

        return out;
    }

    @Override
    public ContentRestriction restrictContent(String keyword) {
        ArrayList<Section> sections = new ArrayList<>();
        for(Section section: this.sections)
            sections.add((Section) section.restrictContent(keyword));

        if (sections.size() != 0) {
            Category result = new Category(this.description, this.image, sections);
            return result;
        }
        else
            return null;
    }
}
