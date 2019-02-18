package F_25_09_2015;

import java.util.HashMap;

public class ObraSocialParticular extends ObraSocial{

    HashMap<String, Integer> descuentos;

    public ObraSocialParticular(){
        this.descuentos = new HashMap<>();
    }

    @Override
    public Integer getDescuento() {
        return 1;
    }

}
