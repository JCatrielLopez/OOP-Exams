package F_03_09_2014;

import java.util.ArrayList;

public class SimpleSection extends Section {

    ArrayList<Question> questions;

    public SimpleSection(){
        questions = new ArrayList<>();
    }

    @Override
    public ArrayList<String> getTopics() {
        ArrayList<String> topics = new ArrayList<>();

        for(Question q: questions)
            topics.addAll(q.getTopics());

        return topics;
    }

    //TODO getters y setters.
}
