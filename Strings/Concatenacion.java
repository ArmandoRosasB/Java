public class Concatenacion {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String alumno = "Armando";

        String detalle = curso + " con el alumno " + alumno;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;
        
        // Siempre tener en cuenta la precedencia
        // Parentesis: Cambian la precedencia

        System.out.println(detalle + numeroA + numeroB);
        System.out.println(detalle + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detalle);

        // Metodo concat -> Mas eficiente
        String detalle2 = curso.concat(" con el alumno ".concat(alumno));
        System.out.println("detalle2 = " + detalle2);

        String detalle3 = curso.concat(" con el alumno ").concat(alumno);
        System.out.println("detalle3 = " + detalle3);
    }
}
