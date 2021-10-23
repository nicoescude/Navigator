public class Road implements ITransportStrategy{//AKA vehiculo particular

    @Override
    public float navigate(Posicion origen, Posicion destino) {
        float multi = 0.5f;
        return origen.distanceTo(destino)*multi;
    }

    @Override
    public String getDescripcion() {
        return "Vamos en nuestro vehiculo particular..";
    }

    @Override
    public String getComodidad() {
        Comodidad comodidad = Comodidad.COMODISIMO;
        return comodidad.value();
    } 
}
