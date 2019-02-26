package F_12_02_2014;

public class ConditionAND implements Condition{

    Condition c1;
    Condition c2;

    public ConditionAND(Condition c1, Condition c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean isSatisfiedBy(FileElement file) {
        return c1.isSatisfiedBy(file) && c2.isSatisfiedBy(file);
    }

}
