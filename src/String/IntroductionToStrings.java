package String;

public class IntroductionToStrings {
    public static void main(String[] args) {
        /*
        String es una clase, por lo tanto al declarar una
        variable String estas creando objetos.

        Por ende, al compararlos con el operador == se estan comparando
        referencias, es decir, instancias de objetos
        */
        String lenguaje = "Java";
        String _lenguaje = new String("Java");
        
        boolean esIgual = lenguaje == _lenguaje;

        System.out.println("esIgual = " + esIgual);
        
        esIgual = lenguaje.equals(_lenguaje);

        System.out.println("esIgual = " + esIgual);
    }
}
