import java.util.Scanner;

public class SistemaNotasDeAlumnos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum1 = 0, sum2 = 0;
        double len1 = 0, len2 = 0;

        double sumaTotal = 0;
        int notas1 = 0;

        System.out.println("Bienvenido, ingresa las 20 notas finales de los alumnos (1 - 7)");

        double aux;
        for(int i = 0; i < 20; i++){
            System.out.print("Ingresa una nota: ");
            aux = scanner.nextDouble();

            if (aux == 0){
                System.out.println("ERROR: Ingresaste 0");
                System.exit(0);
            }

            if (aux ==1){
                notas1++;
            }

            if (aux > 5) {
                sum1 += aux;
                len1++;
            } else if (aux < 4){
                sum2 += aux;
                len2++;
            }

            sumaTotal += aux;
        }

        System.out.println("Promedio notas mayores a 5: " + (sum1 / len1));
        System.out.println("Promedio notas inferiores a 4: " + (sum2 / len2));
        System.out.println("Cantidad de notas iguales a 1: " + notas1);


        System.out.println("Promedio total: " + (sumaTotal / 20));

        scanner.close();
    }
}