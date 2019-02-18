package F_25_09_2015;

import java.util.ArrayList;

public class Paciente {

    ArrayList<String> sintomas;
    ObraSocial obra_social;

    public Integer getDescuento(){
        return this.obra_social.getDescuento();
    }

    public ArrayList<String> getSintomas() {
        return (ArrayList<String>) this.sintomas.clone();
    }
}
