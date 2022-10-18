package futbol;

public class Portero extends Futbolista {

    public short golesRecibidos;
    public byte dorsal;

    public Portero() {
        super();

        this.golesRecibidos = 289;
        this.dorsal = 7;
    }

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");

        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;

    }

    @Override
    public int compareTo(Object arg0) {
        return Math.abs(this.golesRecibidos - ((Portero) arg0).golesRecibidos);
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format(" con el dorsal %d. Le han marcado %d goles", this.dorsal, this.golesRecibidos);
    }

}
