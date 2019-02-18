package F_07_08_2015;

import java.util.Random;

public class IndexRandom implements IndexCalculator {

    public IndexRandom(){
    }

    @Override
    public int getIndex(Integer bound) {
        return new Random().nextInt(bound);
    }
}
