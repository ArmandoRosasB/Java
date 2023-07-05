
import java.util.Scanner;

public class MayorQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0, num2 = 0;

        System.out.print("Ingresa un número: ");
        num1 = scanner.nextDouble();

        System.out.print("Ingresa otro número: ");
        num2 = scanner.nextDouble();

        System.out.println("\nTus números ordenados son: " + ((num1 >= num2)?num1:num2) + ", " + ((num1 >= num2)?num2:num1));

        scanner.close();
    }
}
