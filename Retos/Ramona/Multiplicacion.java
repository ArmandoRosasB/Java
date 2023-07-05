
import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0, signo = 0, respuesta = 0;

        System.out.print("Ingresa un número entero: ");
        num1 = scanner.nextInt();

        System.out.print("Ingresa otro número entero: ");
        num2 = scanner.nextInt();

        System.out.print("\n" + num1 + " * " + num2 + " = ");

        if(num1 < 0) {
            num1 = -num1;
            signo++;
        }

        if(num2 < 0) {
            num2 = -num2;
            signo++;
        }

        for(int i = 0; i < num1; i++) {
            respuesta += num2;
        }

        if(signo%2 == 0) {
            System.out.println(respuesta);
        } else {
            System.out.println((-respuesta));
        }

        scanner.close();
    }
}
