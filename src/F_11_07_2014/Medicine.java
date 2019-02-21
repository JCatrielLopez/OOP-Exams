package F_11_07_2014;


import java.util.ArrayList;
import java.util.HashMap;

public class Medicine extends Drug {

    HashMap<Drug, Float> components;
    ArrayList<String> treatedSymptoms;
    ArrayList<String> contraindications;

    public Medicine(){
        this.components = new HashMap<>();
    }

    public void addComponent(Drug drug){
        this.components.put(drug, 0f);
    }

    public void removeComponent(Drug drug){
        this.components.remove(drug);
    }

    public float getPercentage(String drug){
        float percentage = 0f;

        for(Drug component: components.keySet())
            if (component.getName().equals(drug))
                percentage = percentage + components.get(drug) * component.getPercentage(drug);

        return percentage;
    }

    public boolean cures(String symptom){
        return this.treatedSymptoms.contains(symptom);
    }

    public ArrayList<String> getContraindications(){
        return (ArrayList<String>) this.contraindications.clone();
    }



}
