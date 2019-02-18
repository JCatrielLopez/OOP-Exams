package F_03_09_2014;

import java.util.ArrayList;

public class GroupSection extends Section {

    ArrayList<Section> sections;

    public GroupSection(){
        sections = new ArrayList<>();
    }


    @Override
    public ArrayList<String> getTopics() {
        ArrayList<String> topics = new ArrayList<>();

        for(Section s: sections)
            topics.addAll(s.getTopics());

        return topics;
    }

    //TODO getters y setters.
}
