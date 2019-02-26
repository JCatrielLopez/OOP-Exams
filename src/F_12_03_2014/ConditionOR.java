package F_12_03_2014;

public class ConditionOR implements Condition {

    Condition c1;
    Condition c2;

    public ConditionOR(Condition c1) {
        this.c1 = c1;
    }


    @Override
    public boolean isSatisfiedBy(Transaction transaction) {
        return c1.isSatisfiedBy(transaction) || c2.isSatisfiedBy(transaction);
    }
}
