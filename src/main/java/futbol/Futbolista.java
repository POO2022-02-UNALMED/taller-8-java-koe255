package futbol;

public abstract class Futbolista implements Comparable {
    private String nombre;
    private int edad;
    private final String posicion;

    public Futbolista() {
        this.nombre = "Maradona";
        this.edad = 30;
        this.posicion = "delantero";
    }

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return String.format("El futbolista %s tiene %d y juega de %s", this.nombre, this.edad, this.posicion);
    }

    public boolean equals(Futbolista futbolista) {
        return this == futbolista;
    }

    public abstract boolean jugarConLasManos();

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
