public class HolaMundo { 
    public static void main(String[] args) { // Bootstrap
        String saludar = "Hola mundo desde Java";
        System.out.println(saludar.toUpperCase());

        int numero = 10; // int -> primitivo
                         // Integer -> Clase
        
        boolean bandera = true;

        if (bandera) {
            System.out.println("Un numero = " + numero);
        }
        
        var numero_dos = 15; // var -> variable dinamica
        var cadena = "Soy una cadena";


        System.out.println("Una cadena: " + cadena);
        System.out.println("Un numero: " + numero_dos);

        String nombre;
        nombre = "Anonimo";

        if (numero > 5){
            nombre = "Armando";
        }

        System.out.println("Mi nombre es " + nombre);
        /* 
         Soy un comentario multilinea
        */
    }
}
