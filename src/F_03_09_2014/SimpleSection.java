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

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
