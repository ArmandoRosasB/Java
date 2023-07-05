import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        boolean positive = true;

        System.out.print("Ingresa un numero entero: ");
        x = scanner.nextInt();

        System.out.print("Ingresa otro numero entero: ");
        y = scanner.nextInt();

        if ((x > 0 && y < 0) || (x < 0 && y > 0) ) positive = !positive;

        if (x < 0) x = -x;
        if (y < 0) y = -y;

        int resultado = 0;

        for(int i = 0; i < y; i++){
            resultado += x;
        }

        resultado = positive? resultado : -resultado;

        System.out.println("x * y = " + resultado);
        scanner.close();
    }
}