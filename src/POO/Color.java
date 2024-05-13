package POO;

public enum Color {
    ROJO("Rojo"),
    BLANCO("Blanco"),
    NEGRO("Negro"),
    AMARILLO("Amarillo"),
    VERDE("Verde"),
    NARANJA("Naranja"),
    AZUL("Azul"),
    GRIS("Gris");

    private final String color;

    Color(String color){
        this.color = color;
    }

    @Override
    public String toString (){
        return this.color;
    }
}
