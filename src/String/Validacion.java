package String;

public class Validacion {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        if (esNulo) {
           curso = "Programacion Java";
        }

        boolean esVacio = curso.length() == 0; // curso.isEmpty();

        System.out.println("esVacio = " + esVacio);

        if (!esVacio){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
        
        boolean esBlanco = curso.isBlank();

        if (!esBlanco){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }
}
