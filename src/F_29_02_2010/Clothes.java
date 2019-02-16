package F_29_02_2010;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Clothes {

    HashMap<String, String> characteristics;
    ArrayList<Events> events;

    public int timesUsed(){
        return events.size();
    }




}
