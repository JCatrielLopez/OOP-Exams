package F_25_09_2015;

import java.util.ArrayList;

public class Medicamento {

    ArrayList<String> sintomas_tratados;
    float costo;

    public float getCosto() {
        return this.costo;
    }

    public ArrayList<String> getSintomasTratados() {
        return (ArrayList<String>) this.sintomas_tratados.clone();
    }
}
