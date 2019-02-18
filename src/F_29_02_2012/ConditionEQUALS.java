package F_29_02_2012;

public class ConditionEQUALS implements Condition {

    private String key;
    private String value;

    public ConditionEQUALS(String key, String value){
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean isSatisfied(Clothing clothing) {

        String v = clothing.getChar(key);

        if ((v != null) && (v.equals(value)))
                return true;
        else
            return false;
    }
}
