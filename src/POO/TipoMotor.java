package POO;

public enum TipoMotor {
    DIESEL("Diesel"),
    BENCINA("Bencina");

    private final String nombre;

    TipoMotor(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

}
