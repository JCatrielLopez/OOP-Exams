package F_12_02_2014;

import java.util.Date;

public class ConditionCreationDateYounger implements Condition {

    Date date;

    public ConditionCreationDateYounger(Date date){
        this.date = date;
    }


    @Override
    public boolean isSatisfiedBy(FileElement file) {
        return (file.getCreation_date().compareTo(this.date) == -1);
    }
}
