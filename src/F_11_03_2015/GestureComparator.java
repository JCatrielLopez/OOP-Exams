package F_11_03_2015;

import java.util.Comparator;

public class GestureComparator implements Comparator<Gesture> {

    public GestureComparator(){};

    @Override
    public int compare(Gesture gesture, Gesture t1) {
        return gesture.compareTo(t1);
    }
}
