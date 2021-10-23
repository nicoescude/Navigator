public class App {
    public static void main(String[] args) throws Exception {
        Navigator navigator = new Navigator();

        navigator.setOrigen(new Posicion(10f, 20f));
        navigator.setDestino(new Posicion(20f, 40f));
    
        navigator.setStrat(new Walking());
        navigator.navigate();
        App.separator();
        navigator.setStrat(new Bicicleta());
        navigator.navigate();
        App.separator();
        navigator.setStrat(new PublicTransport());
        navigator.navigate();
        App.separator();
        navigator.setStrat(new Road());
        navigator.navigate();
    }

    public static void print(String msg){
        System.out.println(msg);
    }

    public static void separator(){
        App.print(">--------------------------------<");
    }
}
