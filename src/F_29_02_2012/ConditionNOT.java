package F_29_02_2012;

public class ConditionNOT implements Condition{

    Condition condition;

    public ConditionNOT(Condition condition){
        this.condition = condition;
    }


    @Override
    public boolean isSatisfied(Clothing clothing) {
        return (!condition.isSatisfied(clothing));
    }
}
