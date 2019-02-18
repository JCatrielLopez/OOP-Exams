package F_03_09_2014;

import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question {

    ArrayList<String> answers;
    String validAnswer;

    public MultipleChoiceQuestion(){
        answers = new ArrayList<>();
    }

    public void addAnswer(String answer){
        if (!answers.contains(answer))
            answers.add(answer);
    }

    public void delAnswer(String answer){
        if (answers.contains(answer))
            answers.remove(answer);
    }

    public void setValidAnswer(String answer){
        if (answers.contains(answer))
            validAnswer = answer;
    }

    @Override
    public int getScore() {
        return (this.base_score * answers.size());
    }
}
