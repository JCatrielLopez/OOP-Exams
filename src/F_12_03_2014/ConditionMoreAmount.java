package F_12_03_2014;

public class ConditionMoreAmount implements Condition{

    Transaction transaction;

    public ConditionMoreAmount(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public boolean isSatisfiedBy(Transaction transaction) {
        return (transaction.getAmount() > this.transaction.getAmount());
    }
}
