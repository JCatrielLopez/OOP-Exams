package F_29_02_2012;

import java.util.ArrayList;

public class ConditionCONTAINS implements Condition {

    private String value;
    private ArrayList<String> characteristics_list;

    public ConditionCONTAINS(ArrayList<String> characteristics_list, String value){
        this.characteristics_list = (ArrayList<String>) characteristics_list.clone();
        this.value = value;
    }

    @Override
    public boolean isSatisfied(Clothing clothing) {
        return (characteristics_list.contains(clothing.getChar(value)));
    }
}
