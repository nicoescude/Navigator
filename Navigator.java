public class Navigator {
    private Posicion origen;
    private Posicion destino;
    private ITransportStrategy navStrat;


    public Navigator(){
        this.setOrigen(new Posicion(0, 0));
        this.setDestino(new Posicion(0, 0));
    }

    public void navigate(){
        App.print("Tardaremos en llegar: " + this.getNavStrat().navigate(origen, destino)+" minutos.");
        App.print(this.getNavStrat().getDescripcion()+"  "+this.getNavStrat().getComodidad());
    }

    public void setStrat(ITransportStrategy navStrat) {
        this.navStrat = navStrat;
    }

    private ITransportStrategy getNavStrat() {
        return navStrat;
    }

    public void setOrigen(Posicion origen) {
        this.origen = origen;
    }

    public void setDestino(Posicion destino) {
        this.destino = destino;
    }
}
