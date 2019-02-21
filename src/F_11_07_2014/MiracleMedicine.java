package F_11_07_2014;

import java.util.ArrayList;

public class MiracleMedicine extends Medicine {

    @Override
    public boolean cures(String symptom){
        return true;
    }

    @Override
    public ArrayList<String> getContraindications(){
        return new ArrayList<>();
    }





}
