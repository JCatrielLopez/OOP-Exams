package F_25_09_2015;

import java.util.ArrayList;

public class Farmacia {

    ArrayList<Medicamento> medicamentos;

    private void cobrar(Medicamento medicamento, Integer descuento){
        System.out.println("Se cobraron: $"+(medicamento.getCosto() - descuento * medicamento.getCosto()));
    }

    public void getMedicamento(Paciente paciente){
        boolean atendido = false;
        for(String sintoma: paciente.getSintomas()){
            for(Medicamento medicamento: this.medicamentos){
                if (medicamento.getSintomasTratados().contains(sintoma)) {
                    cobrar(medicamento, paciente.getDescuento());
                    atendido = true;
                    break;
                }
            }
            if (atendido)
                break;
        }

        System.out.println("El paciente se va a morir! No puede ser atendido");
    }
}
