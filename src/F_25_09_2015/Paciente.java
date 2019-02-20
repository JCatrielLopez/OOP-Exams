package F_25_09_2015;

import java.util.ArrayList;

public class Paciente {

    private ArrayList<String> sintomas;
    private ObraSocial obra_social;
    private ArrayList<String> alergias;

    public Paciente(ArrayList<String> sintomas, ObraSocial obra_social, ArrayList<String> alergias){
            this.sintomas = (ArrayList<String>) sintomas.clone();
            this.obra_social = obra_social;
            this.alergias = (ArrayList<String>) alergias.clone();
    }


    public float getDescuento(){
        return this.obra_social.getDescuento(this.sintomas);
    }

    public ArrayList<String> getSintomas() {
        return (ArrayList<String>) this.sintomas.clone();
    }

    boolean esAlergico(String medicamento){
        return (this.alergias.contains(medicamento));
    }

}
