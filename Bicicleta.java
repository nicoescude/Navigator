public class Bicicleta implements ITransportStrategy{

    @Override
    public float navigate(Posicion origen, Posicion destino) {
        float multi=1.5f;
        return origen.distanceTo(destino)*multi;
    }

    @Override
    public String getDescripcion() {
        return "Vamos en bici..";
    }

    @Override
    public String getComodidad() {
        Comodidad comodidad = Comodidad.REGULAR;
        return comodidad.value();
    }
    
}
