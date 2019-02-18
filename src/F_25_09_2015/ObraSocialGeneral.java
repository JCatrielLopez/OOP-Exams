package F_25_09_2015;

public class ObraSocialGeneral extends ObraSocial {

    Integer descuento;

    public ObraSocialGeneral(Integer descuento){
        this.descuento = descuento;
    }

    @Override
    public Integer getDescuento() {
        return this.descuento;
    }
}
