package Flujo_de_control;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        int num = 3;

        switch (num) {
            case 0 -> System.out.println("El numero es cero");
            case 1 -> System.out.println("El numero es uno");
            case 2 -> System.out.println("El numero es dos");
            case 3 -> System.out.println("El numero es 3");
            default -> System.out.println("El numero es menor a cero o mayor a 3");
        }
    }
}
