public interface ITransportStrategy {
    public enum Comodidad{
        COMODISIMO("COMODISIMAMENTE"),COMODO("COMODAMENTE"),REGULAR("REGULARMENTE"),INCOMODO("INCOMODISIMAMENTE");
        private String s;
        private Comodidad(String s){
            this.s = s;
        }
        public String value(){ return this.s; }
    }
    public float navigate(Posicion origen, Posicion destino);
    public String getDescripcion();
    public String getComodidad();
}
