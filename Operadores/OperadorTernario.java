import java.util.Scanner;

public class OperadorTernario { 
    public static void main(String[] args) {
        // OPERADOR TERNARIO: DEVUELVE UN VALOR

        // variable = condicion ?  verdadero : falso
        
        String variable = 1 == 1 ? "Si es verdadero" : "No es verdadero";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la calificacion de matematicas: ");
        matematicas = scanner.nextDouble();

        System.out.print("Ingrese la calificacion de ciencias: ");
        ciencias = scanner.nextDouble();

        System.out.print("Ingrese la calificacion de historia: ");
        historia = scanner.nextDouble();

        promedio = (matematicas + historia + ciencias) / 3;

        estado = promedio > 7 ? "Aprobado" : "Reprobado";
        System.out.println("Promedio = " + promedio);
        System.out.println("Estado = " + estado);

        scanner.close();
    }
}
