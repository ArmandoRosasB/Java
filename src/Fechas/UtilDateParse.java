package Fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UtilDateParse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingresa una fecha con el formato yyyy-MM-dd: ");

        try {
            Date fecha = df.parse(scanner.next());
            String fechaFormateada = df.format(fecha);

            System.out.println("\nLa fecha escrita es " + fecha);
            System.out.println("La fecha formateada es " + fechaFormateada);

            Date fechaActual = new Date();

            if (fecha.after(fechaActual)){
                System.out.println("La fecha ingresada por el usuario es mayor a la fecha actual");
            } else if (fecha.before(fechaActual)){
                System.out.println("La fecha ingresada por el usuario es menor a la fecha actual");
            } else if (fecha.equals(fechaActual)){
                System.out.println("La fecha ingresada por el usuario es igual a la fecha actual");
            }
        } catch (ParseException e) {
            System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
            // System.exit(1)
            main(args);
        }

    }
}
