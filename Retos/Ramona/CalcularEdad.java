
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strPattern = "dd-MM-yyyy", input = "";
        SimpleDateFormat pattern = new SimpleDateFormat(strPattern);

        Date fecha = new Date();
        String[] hoy = pattern.format(fecha).split("-");


        System.out.println("Ingresa tu fecha de nacimiento (" + strPattern + ")");
        System.out.print("Fecha: ");
        input = scanner.next();

        try {
            fecha = pattern.parse(input);
            String[] nacimiento = input.split("-");

            int edad = Integer.parseInt(hoy[2]) - Integer.parseInt(nacimiento[2]);

            if(hoy[1].compareTo(nacimiento[1]) < 0) {
                edad--;
            } else if(hoy[1].compareTo(nacimiento[1]) == 0) {
                edad = (hoy[0].compareTo(nacimiento[0]) < 0)?edad-1:edad;
            }

            System.out.println("\nTu edad es: " + edad + " año(s)");
        } catch (Exception e) {
            System.out.println("\nERROR\n Debes ingresar la fecha respetando el siguiente patrón: " + strPattern + '\n');
        }

        scanner.close();
    }
}