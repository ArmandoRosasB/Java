import java.util.Scanner;

public class SistemaEstanqueDeGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double litros;

        System.out.print("Ingresa la cantidad en litros de gasolina: ");
        litros = scanner.nextDouble();

        if (litros > 70){
            System.out.println("Overflow");
        } else if (litros == 70){
            System.out.println("Estanque lleno");
        } else if (litros >= 60) {
            System.out.println("Estanque casi lleno");
        } else if (litros >= 40) {
            System.out.println("Estanque 3/4");
        } else if (litros >= 35){
            System.out.println("Medio Estanque");
        } else if (litros >= 20){
            System.out.println("Suficiente");
        } else if (litros >= 1){
            System.out.println("Insuficiente");
        } else {
            System.out.println("Underflow");
        }

        scanner.close();
        
    }
}
