
import java.util.Scanner;

public class BuscarMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, min = Integer.MAX_VALUE, num;

        System.out.println("¿Cuántos números deseas ingresar?");
        System.out.println(" * Mínimo 10 para una búsqueda divertida");
        System.out.print("n = ");
        n = scanner.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            num = scanner.nextInt();

            min = (min<num)?min:num;
        }

        System.out.println("\nNúmero menor: " + min);
        if(min < 10) {
            System.out.println("¡" + min + " es menor que 10!");
        } else {
            System.out.println("¡" + min + " es mayor o igual que 10!");
        }

        scanner.close();
    }
}
