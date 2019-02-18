package F_07_08_2015;

public class IndexIntercalated implements IndexCalculator {

    Integer last_index;
    Integer increment;
    Integer first;

    public IndexIntercalated(Integer increment, Integer first){
        this.increment = increment;
        this.last_index = first;
        this.first = first;
    }

    @Override
    public int getIndex(Integer bound) {
        if ((last_index+increment) <= bound)
            last_index += increment;
        else
            last_index = first;

        return last_index;
    }
}
