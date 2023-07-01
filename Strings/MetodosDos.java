public class MetodosDos {
    public static void main(String[] args) {
        String trabalenguas = "trabatrabatraba";

        // Remplazar un substring 
        System.out.println("trabalenguas.replace('a', '.') = " + trabalenguas.replace('a', '.'));

        // Obtener el indice donde comienza un substring (Primera ocurrencia)
        System.out.println("trabalenguas.indexOf(\"traba\") = " + trabalenguas.indexOf("traba"));

        // Obtener el indice donde comienza un substring (Ultima ocurrencia)
        System.out.println("trabalenguas.lastIndexOf(\"traba\") = " + trabalenguas.lastIndexOf("traba"));

        System.out.println("trabalenguas.indexOf('w') = " + trabalenguas.indexOf('w'));

        // SAber si un substrign esta contenido o no (true o false) 
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));

        // Checar si un string comienza con un substring
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));

        // Checar si un string termina con un substring
        System.out.println("trabalenguas.endsWith(\"traba\") = " + trabalenguas.endsWith("traba"));


        System.out.println("    trabalenguas     " );
        System.out.println("    trabalenguas     ".trim());
    }
}
