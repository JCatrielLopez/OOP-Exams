package F_11_07_2014;

public abstract class Drug {

    String name;
    Float amount;

    protected abstract float getAmount(Drug drug);

    public String getName(){
        return this.name;
    }

}
