package POO;

public enum TipoAutomovil {
    DEPORTIVO("Deportivo", 2),
    PICKUP("Pick Up", 4),
    CONVERTIBLE("Convertible", 2),
    FAMILIAR("Familiar", 4);

    private final String nombre;
    private final int numero_puertas;

    TipoAutomovil(String nombre, int numero_puertas){
        this.nombre = nombre;
        this.numero_puertas = numero_puertas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getNumeroPuertas(){
        return  this.numero_puertas;
    }
}
