package F_25_09_2015;

import java.util.ArrayList;

public class ObraSocialGeneral extends ObraSocial {

    Integer descuento;

    public ObraSocialGeneral(Integer descuento){
        this.descuento = descuento;
    }

    @Override
    public float getDescuento(ArrayList<String> medicamento) {
        return this.descuento;
    }
}
