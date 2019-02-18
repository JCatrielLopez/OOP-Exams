package F_29_02_2012;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Clothes {

    protected HashMap<String, String> characteristics;
    protected ArrayList<Event> events;

    public int timesUsed(){
        return events.size();
    }

    public abstract String getChar(String c);


    public void delChar(String k){
        if (characteristics.containsKey(k))
            characteristics.remove(k);
    }

    public void addEvent(Event e){
        if (!events.contains(e))
            events.add(e);
    }

    public void delEvent(Event e){
        if (events.contains(e))
            events.remove(e);
    }

    public abstract ArrayList<Clothes> getClothes(Condition c);
}
