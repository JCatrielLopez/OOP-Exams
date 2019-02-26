package F_13_02_2013;

public class Text implements Content {

    String content;

    public Text(String text){
        this.content = text;
    }


    @Override
    public Object get() {
        return this.content;
    }
}
