public class Walking implements ITransportStrategy{

    @Override
    public float navigate(Posicion origen, Posicion destino) {
        float multi = 7f;
        return origen.distanceTo(destino)*multi;
    }

    @Override
    public String getDescripcion() {
        return "Vamos caminando..";
    }

    @Override
    public String getComodidad() {
        Comodidad comodidad = Comodidad.INCOMODO;
        return comodidad.value();
    }
}
