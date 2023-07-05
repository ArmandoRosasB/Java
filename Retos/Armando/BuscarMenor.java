import java.util.Scanner;

public class BuscarMenor {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Ingresa el numero de numeros a comparar (Al menos 10): ");
            size = scanner.nextInt();

        } while (size < 10);

        // Limpiar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int min = Integer.MAX_VALUE;
        int aux;

        for (int i = 0; i < size; i++){
            System.out.print("Ingresa un numero: ");
            aux = scanner.nextInt();

            min = (aux < min) ? aux : min;
        }

        System.out.println();

        String resultado;
        resultado = (min < 10) ? Integer.toString(min).concat(" es menor que 10!") : Integer.toString(min).concat(" es igual o mayor que 10!");
        
        System.out.println(resultado);

        scanner.close();
        
    }
}
