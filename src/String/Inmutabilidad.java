package String;

public class Inmutabilidad {
    public static void main(String[] args) {
        String afirmacion = "Mi lenguaje de programacion favorito es ";
        String lenguaje = "Java";
        
        /*
        Al momento de realizar alguna modificacion a un string, 
        se crea una nueva instancia con la mmodificacion. 
        
        NO SE MODIFICA EN SI
        
        */
        System.out.println("lenguaje = " + lenguaje);
        afirmacion.concat(lenguaje);
        System.out.println("lenguaje = " + lenguaje);
        
        String resultado = afirmacion.concat(lenguaje);
        System.out.println("resultado = " + resultado);

        System.out.println("Son iguales: " + (resultado == afirmacion));


        String resultado2 = afirmacion.transform(c -> c + lenguaje);


        System.out.println("resultado2 = " + resultado2);
    }
}
