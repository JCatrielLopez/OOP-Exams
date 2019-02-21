package F_26_02_2016;

public class ConditionAuthor implements Condition {

    String author;

    public ConditionAuthor(String author){
        this.author = author;
    }

    @Override
    public boolean isSatisfied(News news) {
        return (news.getAuthor().equals(this.author));
    }

}
