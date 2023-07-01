public class Inmutabilidad {
    /*
        Los string son inmutables
        Cuando cambiamos el valor de un string, lo que sucede
        es que se crea un nuevo objeto y la variable cambia de referencia.
    */
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String alumno = "Armando";

        // concat -> devuelve un String, no lo modifca
        curso.concat(alumno);
        System.out.println("Curso = " + curso);

        String resultado = curso.concat(" ".concat(alumno));
        System.out.println("Resultado = " + resultado);
        System.out.println(curso == resultado);
        
        // transform
        curso.transform((c) -> {
            return c + " con el alumno " + alumno;
        });
        System.out.println("Curso = " + curso);

        String resultado2 = curso.transform((c) -> {
            return c + " con el alumno " + alumno;
        });

        System.out.println("Resultado2 = " + resultado2);


        // replace
        resultado.replace("a", "A");
        System.out.println("Resultado = " + resultado);

        String resultado3 = resultado.replace("a", "A");
        System.out.println("Resultado3 = " + resultado3);
    }
}
