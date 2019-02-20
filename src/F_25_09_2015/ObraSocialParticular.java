package F_25_09_2015;

import java.util.ArrayList;
import java.util.HashMap;

public class ObraSocialParticular extends ObraSocial{

    HashMap<String, Integer> descuentos;

    public ObraSocialParticular(){
        this.descuentos = new HashMap<>();
    }

    @Override
    public float getDescuento(ArrayList<String> sintomas) {
        float max_descuento = 0f;

        boolean todoOK = false;
        for(String sintoma: sintomas){
            if (this.descuentos.containsKey(sintoma)) {
                todoOK = true;
                if (max_descuento < this.descuentos.get(sintoma))
                    max_descuento = this.descuentos.get(sintoma);
            }

        }

        if (todoOK)
            return max_descuento;
        else
            return (float) 0.10;
    }

}
