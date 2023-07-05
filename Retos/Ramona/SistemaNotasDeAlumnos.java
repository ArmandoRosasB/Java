
import java.util.Scanner;

public class SistemaNotasDeAlumnos {
    public static void main(String[] args) {
        int notas = 1, count1 = 0, count5 = 0, count4 = 0;
        double nota = 0, avg = 0, avg5 = 0, avg4 = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa tus notas en escala de 1 a 7\n");

        while(notas < 21) {
            System.out.print("Nota " + notas + ": ");
            nota = scanner.nextDouble();

            if(nota < 1 || nota > 7) {
                System.out.println("\nERROR\nTu nota no puede ser " + nota + "\nFavor de verificar la información");
                System.exit(0);
            } else if(nota > 5) {
                avg5 += nota;
                count5++;
            } else if(nota < 4) {
                avg4 += nota;
                count4++;

                if(nota == 1) count1++;
            }

            avg += nota;
            notas++;
        }

        avg5 /= count5;
        avg4 /= count4;
        avg /= 20;

        System.out.println("\nRESUMEN");
        System.out.println(count1 + " nota(s) de 1");
        System.out.println("\nPromedios");
        System.out.println(" Notas mayores a 5: " + avg5);
        System.out.println(" Notas menores a 4: " + avg4);
        System.out.println(" Total: " + avg);

        scanner.close();
    }
}
