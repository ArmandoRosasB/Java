package String;

public class Metodos {
    public static void main(String[] args) {
        String cadena = "Esto es una cadena";

        System.out.println("Cadena: " + cadena);

        System.out.println("Metodo length(): " + cadena.length());
        System.out.println("Metodo toUpperCase(): " + cadena.toUpperCase());
        System.out.println("Metodo toLowerCase(): " + cadena.toLowerCase());
        System.out.println("Metodo equals(Esto es una cadena): " + cadena.equals("Esto es una cadena"));
        System.out.println("Metodo equals(Esto no es una cadena): " + cadena.equals("Esto es una cadena"));
        System.out.println("Metodo equalsIgnoreCase(esTo Es Una cADena): " + cadena.equalsIgnoreCase("esTo Es Una cADena"));
        System.out.println("Metodo charAt(0): " + cadena.charAt(0));

        // Metodo substring
        /*
            Parametros
            0: Punto inicial
            1: Punto final (No inclusivo)
        */

        System.out.println("Metodo substring(3): " + cadena.substring(3));
        System.out.println("Metodo substring(3, 5): " + cadena.substring(5, 7));

        // Metodo compareTo()
        /*
            Returns
            0 -> Las cadenas son iguales
            < 0 -> La cadena es lexicograficamente menor
            > 0 -> La cadena es lexicograficamente mayor
        */

        String b = "b";

        System.out.println("Cadena: " + b);
        System.out.println("Metodo compareTo(a): " + b.compareTo("a"));
        System.out.println("Metodo compareTo(c): " + b.compareTo("c"));


        System.out.println("Metodo replace(a, .): " + cadena.replace("a", "."));

        String otra_cadena = "tra.ba.len.guas";
        System.out.println("Otra cadena: " + otra_cadena);
        System.out.println("Metodo toCharArray(): ");

        char [] char_array = otra_cadena.toCharArray();

        System.out.print("[");

        for(char c : char_array){
            System.out.print(" '" + c + "' ");
        }

        System.out.print("]");


        System.out.println("Metodo split('|'): " );
        String [] string_array = otra_cadena.split("\\.");

        System.out.print("[");

        for(String s : string_array){
            System.out.print(" '" + s + "' ");
        }

        System.out.print("]");

    }
}
