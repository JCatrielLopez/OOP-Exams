package F_03_09_2014;

import java.util.HashMap;

public class MultipleAnswersQuestion extends Question {

    HashMap<String, Boolean> answers;
    Integer base_score_extra;

    public MultipleAnswersQuestion(){
        this.answers = new HashMap<>();
    }

    public void addAnswer(String answer, Boolean isValid){
        if (!answers.containsKey(answer))
            answers.put(answer, isValid);
    }

    public void delAnswer(String answer){
        if (answers.containsKey(answer))
            answers.remove(answer);
    }


    @Override
    public int getScore() {
        Integer totalAnswers = answers.size();

        Integer validAnswers = 0;
        for (String a: answers.keySet()){
            if (answers.get(a))
                validAnswers++;
        }

        return this.base_score + this.base_score_extra * (totalAnswers / validAnswers);
    }
}
