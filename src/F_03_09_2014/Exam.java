package F_03_09_2014;

import java.util.ArrayList;

public class Exam {

    Condition validCondition;
    ArrayList<Section> sections;

    public Exam(){
        sections = new ArrayList<>();
    }

    public void addSection(Section s){
        this.sections.add(s);
    }

    public void deleteSection(Section s){
        this.sections.remove(s);
    }

    public ArrayList<String> getTopics(){
        ArrayList<String> topics = new ArrayList<>();
        for(Section s: sections)
            topics.addAll(s.getTopics());

        return topics;
    }

    public boolean isValid(){
        return validCondition.isSatisfied(this); //TODO
    }
}
