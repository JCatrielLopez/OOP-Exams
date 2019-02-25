package F_03_07_2013;

public abstract class Task {

    String name;
    States state;
    Integer length;
    float cost;

    public abstract Integer getLength();
    public abstract float getCost();

    public String getName(){return this.name;}

    public void setName(String name) {
        this.name = name;
    }

    public States getState() {
        return state;
    }

    public void setState(States state) {
        this.state = state;
    }


}
