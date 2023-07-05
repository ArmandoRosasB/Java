import java.util.Scanner;

public class MayorQue {
    public static void main(String[] args) {
        String respuesta;
        int num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita un numero: ");
        num1 = scanner.nextInt();

        System.out.print("Digita otro numero: ");
        num2 = scanner.nextInt();

        respuesta = (num1 > num2)? Integer.toString(num1).concat(", ").concat(Integer.toString(num2)) : Integer.toString(num2).concat(", ").concat(Integer.toString(num1));
        System.out.print("\nTus numeros ordenados son: ");
        System.out.println(respuesta);

        scanner.close();
    }
}
