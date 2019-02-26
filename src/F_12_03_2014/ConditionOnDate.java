package F_12_03_2014;

import java.util.Date;

public class ConditionOnDate implements Condition{

    Date date;

    public ConditionOnDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean isSatisfiedBy(Transaction transaction) {
        return transaction.getDate().equals(this.date);
    }
}
