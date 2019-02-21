package F_26_02_2016;

import java.util.ArrayList;

public class News extends WebContent {

    private Category category;
    private String title;
    private ArrayList<String> keywords;
    private String introduction;
    private String content;
    private String author;
    private String link;

    public News(Category category, String title, ArrayList<String> keywords, String introduction, String content, String author, String link) {
        this.category = category;
        this.title = title;
        this.keywords = keywords;
        this.introduction = introduction;
        this.content = content;
        this.author = author;
        this.link = link;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }


}
