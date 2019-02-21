package F_26_02_2016;

public class ConditionKeyword {

    String keyword;

    public ConditionKeyword(String keyword){
        this.keyword = keyword;
    }

    public boolean isSatisfied(News news){
        return (news.containsKeyword(this.keyword));
    }
}
