import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        // String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;

        try {
            numeroDecimal =  scanner.nextInt();//Integer.parseInt(numeroStr);
        } catch (InputMismatchException e) { // Exception e -> Sirve para manejar cualqueir excepcion
            System.out.println("Error: Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }
        

        System.out.println("Numero decimal = " + numeroDecimal);

        String mensajeBinario = "\nNumero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String mensajeOctal = "\nNumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String mensajeHex = "\nNumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        String mensaje = mensajeBinario;
        mensaje += mensajeOctal;
        mensaje += mensajeHex;

       System.out.println(mensaje);
    }
}