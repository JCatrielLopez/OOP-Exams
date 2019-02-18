package F_29_02_2012;

public class ConditionAND implements Condition {

    private Condition c1;
    private Condition c2;

    public ConditionAND(Condition condition_1, Condition condition_2){
        this.c1 = condition_1;
        this.c2 = condition_2;
    }

    @Override
    public boolean isSatisfied(Clothing clothing) {
        return (c1.isSatisfied(clothing) && c2.isSatisfied(clothing));
    }
}
