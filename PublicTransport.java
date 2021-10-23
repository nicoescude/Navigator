public class PublicTransport implements ITransportStrategy{

    @Override
    public float navigate(Posicion origen, Posicion destino) {
        float multi  = 1f;
        return origen.distanceTo(destino)*multi;
    }

    @Override
    public String getDescripcion() {
        return "Vamos en colectivo..";
    }

    @Override
    public String getComodidad() {
        Comodidad comodidad = Comodidad.COMODO;
        return comodidad.value();
    }
}
