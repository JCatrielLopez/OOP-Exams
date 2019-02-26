package F_13_02_2013;

public class ContentDecorator implements Content{

    Content content;

    public ContentDecorator(Content content){
        this.content = content;
    }

    public Object get(){
        return this.content;
    }
}
