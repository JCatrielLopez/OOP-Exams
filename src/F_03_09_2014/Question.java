package F_03_09_2014;

import java.util.ArrayList;

public abstract class Question {

    String question;
    Integer time;
    ArrayList<String> topics;
    Integer base_score;

    public abstract int getScore();


    public String getQuestion(){
        return this.question;
    }

    public int getTime(){
        return (this.getScore() * time);
    }

    public ArrayList<String> getTopics(){
        return (ArrayList<String>) this.topics.clone();
    }

    public void addTopic(String topic){
        if (!topics.contains(topic))
            this.topics.add(topic);
    }

    public void delTopic(String topic){
        if (topics.contains(topic))
            this.topics.remove(topic);
    }

}
