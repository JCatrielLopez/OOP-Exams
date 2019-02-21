package F_11_07_2014;

public abstract class Drug {

    String name;
    Float amount;


    public String getName(){
        return this.name;
    }

    public abstract float getPercentage(String drug);

}
