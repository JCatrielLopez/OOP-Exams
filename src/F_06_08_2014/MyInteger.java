package F_06_08_2014;

public class MyInteger extends Primitive {

    int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public MyInteger sum(MyInteger i) {
        return new MyInteger(this.value + i.getValue());
    }

    public MyFloat sum(MyFloat f){
        return f.sum(this);
    }

    public MyDate sum(MyDate d){
        return d.sum(this);
    }

    public boolean isGreatherTan(MyInteger i){
        return (this.value > i.getValue());
    }
}
