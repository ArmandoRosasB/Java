public class Validacion {
    public static void main(String[] args) {
        
        String curso = null;

        // Validar si un Sring es nulo
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        // NullPointerException

        //System.out.println(curso.concat(" desde cero!"));
        //System.out.println("Bienvenido al curso ".concat(curso));

        
        if (esNulo){
            curso = "Programacion Java";
        }

        // Validar si un string tiene contenido
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        if (!esVacio2){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }

        // Validar que un string tenga contenido
        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if (!esBlanco){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
        
    }
}
