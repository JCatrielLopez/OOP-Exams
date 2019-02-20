package F_25_09_2015;

import java.util.ArrayList;

public class Medicamento {

    ArrayList<String> sintomas_tratados;
    String name;
    float costo;

    public Medicamento(String name){
        this.name  = name;
    }

    public float getCosto() {
        return this.costo;
    }

    public ArrayList<String> getSintomasTratados() {
        return (ArrayList<String>) this.sintomas_tratados.clone();
    }

    @Override
    public String toString(){
        return this.name;
    }
}
