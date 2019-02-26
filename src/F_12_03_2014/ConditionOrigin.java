package F_12_03_2014;

public class ConditionOrigin implements  Condition{

    Account origin;

    public ConditionOrigin(Account origin) {
        this.origin = origin;
    }

    @Override
    public boolean isSatisfiedBy(Transaction transaction) {
        return transaction.getOrigin().equals(this.origin);
    }
}
