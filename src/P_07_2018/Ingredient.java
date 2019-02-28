package P_07_2018;

import java.util.HashMap;

public abstract class Ingredient {

    HashMap<String, Object> characteristics;

    public Object get(String characteristic){
        if (this.characteristics.keySet().contains(characteristic))
            return this.characteristics.get(characteristic);
        else
            return null;
    }

    public void addCharacteristic(String characteristic, Object value){
        this.characteristics.putIfAbsent(characteristic, value);
    }

    public void removeCharacteristic(String characteristic){
        this.characteristics.remove(characteristic);
    }

    //TODO: metodos abstractos
}
