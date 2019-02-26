package F_13_02_2013;

public class AddTextDecorator extends ContentDecorator {

    Text text;

    public AddTextDecorator(Content content, Text text){
        super(content);
        this.text = text;
    }

    @Override
    public Object get() {
        Object out  = super.get();
        System.out.println(this.text);
        return out;
    }
}
