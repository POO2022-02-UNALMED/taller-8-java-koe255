package futbol;

public class Jugador extends Futbolista {

    public short golesMarcados;
    public byte dorsal;

    public Jugador() {
        super();

        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);

        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;

    }

    @Override
    public int compareTo(Object arg0) {
        return Math.abs(this.getEdad() - ((Futbolista) arg0).getEdad());
    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
    }

}
