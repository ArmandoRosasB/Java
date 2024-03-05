package String;

public class Concatenacion {
    public static void main(String[] args) {
        String afirmacion = "Mi lenguaje de programacion favorito es ";
        String lenguaje = "Java";
        
        String oracion;

        // Metodo 1
        oracion = afirmacion + lenguaje;

        System.out.println("oracion = " + oracion);
        
        // Metodo 2
        oracion = afirmacion.concat(lenguaje);
        System.out.println("oracion = " + oracion);

        // Metodo 3
        StringBuilder sb = new StringBuilder();

        sb.append(afirmacion).append(lenguaje);

        System.out.println("oracion = " + sb);
    }
}
