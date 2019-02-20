package F_11_07_2014;


import java.util.ArrayList;

public class Medicine extends Drug {

    ArrayList<Drug> components;

    public Medicine(){
        this.components = new ArrayList<>();
    }

    public void addComponent(Drug drug){
        this.components.add(drug);
    }

    public void removeComponent(Drug drug){
        this.components.remove(drug);
    }

    public float getAmount(Drug drug) { //TODO: Corregir la forma de calcular la cantidad. Se multiplican los niveles!
        float amount = 0f;
        for (Drug component : components)
            if (component.getName().equals(drug.getName()))
                amount += component.getAmount(drug);

        return amount;
    }

}
