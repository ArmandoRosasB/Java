public class MetodosUno {
    public static void main(String[] args) {
        
        String nombre = "Armando";

        // Largo de la cadena
        System.out.println("nombre.length() = " + nombre.length());
        

        // Convertir a mayusculas
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());

        // Convertir a minusculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());

        // Comparar el contenido de dos strings
        System.out.println("nombre.equals(\"Armando\") = " + nombre.equals("Armando"));

        System.out.println("nombre.equals(\"armando\") = " + nombre.equals("armando"));


        // Comparar dos string ignorando mayusculas o minusculas
        System.out.println("nombre.equalsIgnoreCase(\"armando\") = " + nombre.equalsIgnoreCase("armando"));


        // Comparacion  lexicograficamente
        /* compareTo
         * 0 -> Ambas cadenas son iguales
         * > 0 -> La cadena que invoca al metodo es mas grande lexicograficamente 
         * < 0 -> La cadena que invoca el metodo es mas chica lexicograficamente
         */
        System.out.println("nombre.compareTo(\"Armando\") = " + nombre.compareTo("Armando"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        
        // Obtener un caracter
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1));
    
    
        // Obtener un fragmento del String
        // substring(n) siendo n el "desde" -> [n, ]
        // substring (n, m) siendo n el "desde" y m el "hasta" (no se incluye) - > [n, m)
        System.out.println("nombre.subString(1) = " + nombre.substring(1));
        System.out.println("nombre.subString(1, 4) = " + nombre.substring(1, 4));
    
    
    } 
}