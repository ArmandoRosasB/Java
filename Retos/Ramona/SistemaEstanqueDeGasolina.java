
import java.util.Scanner;

public class SistemaEstanqueDeGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double medida = 0;

        System.out.print("Ingresa la medida de tu estanque: ");
        medida = scanner.nextDouble();

        if(medida > 70 || medida < 1) {
            System.out.println("Medida inválida...");
        } else if (medida == 70) {
            System.out.println("Estanque lleno");
        } else if(medida >= 60) {
            System.out.println("Estanque casi lleno");
        } else if(medida >= 40) {
            System.out.println("Estanque 3/4");
        } else if(medida >= 35) {
            System.out.println("Medio estanque");
        } else if(medida >= 20) {
            System.out.println("Suficiente");
        } else {
            System.out.println("Insuficiente");
        }

        scanner.close();
    }
}
