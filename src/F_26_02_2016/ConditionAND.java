package F_26_02_2016;

public class ConditionAND implements Condition{

    Condition c1;
    Condition c2;

    public ConditionAND(Condition c1, Condition c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean isSatisfied(News news) {
        return (c1.isSatisfied(news) && c2.isSatisfied(news));
    }
}
