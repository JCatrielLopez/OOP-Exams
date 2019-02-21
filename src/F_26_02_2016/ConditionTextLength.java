package F_26_02_2016;

public class ConditionTextLength implements Condition{

    Integer length;

    public ConditionTextLength(Integer length){
        this.length = length;
    }

    @Override
    public boolean isSatisfied(News news) {
        return (news.getContent().length() > this.length);
    }
}
