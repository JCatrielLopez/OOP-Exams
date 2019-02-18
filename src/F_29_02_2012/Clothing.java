package F_29_02_2012;

import java.util.ArrayList;
import java.util.HashMap;

public class Clothing extends Clothes{


    public Clothing(){
        this.characteristics = new HashMap<>();
        this.events = new ArrayList<>();
    }

    @Override
    public String getChar(String c){
        if (characteristics.containsKey(c))
            return characteristics.get(c);
        else
            return null;
    }

    @Override
    public ArrayList<Clothes> getClothes(Condition c) {
        ArrayList<Clothes> out = new ArrayList<>();
        if (c.isSatisfied(this))
            out.add(this);

        return out;
    }

    public void addChar(String k, String v){
        if (!characteristics.containsKey(k))
            characteristics.put(k, v);
    }


}
