package F_07_08_2015;

public class IndexSequential implements IndexCalculator {

    Integer last_index;

    public IndexSequential(){
        this.last_index = 0;
    }

    @Override
    public int getIndex(Integer bound) {
        if (last_index+1 <= bound)
            last_index++;
        else
            last_index = 0;

        return last_index;
    }
}
