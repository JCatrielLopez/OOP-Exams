package F_06_08_2014;

public class MyFloat extends Primitive {

    float value;

    public MyFloat(float value){
        this.value = value;
    }

    public float getValue(){
        return this.value;
    }

    public MyFloat sum(MyFloat f){
        return new MyFloat(this.value + f.getValue());
    }

    public MyFloat sum(MyInteger f){
        return new MyFloat(this.value + f.getValue());
    }

}
