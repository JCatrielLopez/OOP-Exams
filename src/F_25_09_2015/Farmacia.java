package F_25_09_2015;

import java.util.ArrayList;

public class Farmacia {

    private ArrayList<Medicamento> medicamentos;

    public Farmacia(){
        this.medicamentos = new ArrayList<>();
    }


    public ArrayList<Medicamento> getMedicamentos(String sintoma){
        ArrayList<Medicamento> out = new ArrayList<>();
        for(Medicamento m: this.medicamentos){
            if (m.getSintomasTratados().contains(sintoma))
                out.add(m);
        }

        return out;
    }

    public void addMedicamentos(ArrayList<Medicamento> medicamentos){
        this.medicamentos.addAll(medicamentos);
    }

    public void addMedicamentos(Medicamento medicamento){
        this.medicamentos.add(medicamento);
    }

    private void cobrar(float costo, float descuento){
        System.out.println("Se cobraron: $"+(costo - descuento * costo));
    }

    public void getMedicamento(Paciente paciente){
        boolean atendido = true;
        for(Medicamento medicamento: this.medicamentos){
            for(String sintoma: paciente.getSintomas()){
                if (!medicamento.getSintomasTratados().contains(sintoma) && paciente.esAlergico(medicamento.toString())){
                    atendido = false;
                    break;
                }
            }
            cobrar(medicamento.getCosto(), paciente.getDescuento());
            if (atendido)
                break;
        }

        System.out.println("El paciente se va a morir! No puede ser atendido");
    }

}
