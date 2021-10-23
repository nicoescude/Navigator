public class Posicion {
    private float x,z;
    public Posicion(float x, float z){
        this.x = x;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getZ() {
        return z;
    }

    public float distanceTo(Posicion destino){
        float ladoA = Math.abs(this.getX() - destino.getX());
        float ladoB = Math.abs(this.getZ() - destino.getZ());
        float distance = (float) Math.sqrt(ladoA*ladoA + ladoB*ladoB);
        return distance;
    }
}
