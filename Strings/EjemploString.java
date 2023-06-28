public class EjemploString {
    public static void main(String[] args) {
      
        // literal
        String curso = "Programacion Java";

        // Crear una instancia
        String curso2 = new String("Programacion Java");

        // Comparamos si el objeto creado es el mismo, no el contenido
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        // Comparando el valor del objeto y no el objeto en si
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);


        String curso3 = "Programacion Java";
        String curso4 = "programacion java";


        esIgual = curso3.equalsIgnoreCase(curso4);
        System.out.println("curso3.equalsIgnoreCase(curso4) = " + esIgual);

        // Comparacion entre dos Strings literales
        // ¿¿¿ Comparara las referencias de los objetos o los valores ???
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);
        // ES TRUE 

        /*
         Se debe a que al ser iguales, se asigna la referencia al primer
         objeto creado
         */
    }
}