package F_11_03_2015;

import java.util.ArrayList;

public class Gesture implements Comparable<Gesture> {

    ArrayList<Frame> frames;

    public Gesture(){
        this.frames = new ArrayList<>();
    }

    public int getAmountOfFrames(){
        return this.frames.size();
    }

    @Override
    public int compareTo(Gesture gesture) {
        return Integer.compare(this.getAmountOfFrames(), gesture.getAmountOfFrames());
    }
}
