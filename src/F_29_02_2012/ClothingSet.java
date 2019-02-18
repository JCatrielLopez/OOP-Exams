package F_29_02_2012;

import java.util.*;

public class ClothingSet extends Clothes {

    private ArrayList<Clothes> clothes;


    public ClothingSet(){
        this.characteristics = new HashMap<>();
        this.events = new ArrayList<>();
    }

    @Override
    public String getChar(String characteristic) {
        HashMap<String, Integer>  values = new HashMap<>();

        for (Clothes c: clothes) {
            String value = c.getChar(characteristic);
            if (value != null){
                if (values.containsKey(value))
                        values.put(value, values.get(value)+1);
                else
                    values.put(value, 1);
            }
        }

        String keyOfMaxValue = Collections.max(
                values.entrySet(),
                (o1, o2) -> o1.getValue() >= o2.getValue()? 1:-1).getKey();

        return keyOfMaxValue;
    }

    @Override
    public ArrayList<Clothes> getClothes(Condition c) {
        ArrayList<Clothes> out = new ArrayList<>();
        for (Clothes cl: clothes) {
            ArrayList<Clothes> aux = cl.getClothes(c);
            out.addAll(aux);
        }

        return out;
    }


}
