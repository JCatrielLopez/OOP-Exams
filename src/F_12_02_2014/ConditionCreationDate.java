package F_12_02_2014;

import java.util.Date;

public class ConditionCreationDate implements Condition {

    Date date;

    public ConditionCreationDate(Date date){
        this.date = date;
    }


    @Override
    public boolean isSatisfiedBy(FileElement file) {
        return file.getCreation_date().equals(this.date);
    }
}
