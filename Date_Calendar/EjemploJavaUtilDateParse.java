package Date_Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Configuracion del patron
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print("Ingrese una fecha con formato 'yyyy-MM-dd': ");

        // OBLIGATORIO: USAR TRY CATCH

        try {
            Date fecha = df.parse(scanner.nextLine());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + df.format(fecha));

            Date fecha2 = new Date();

            if (fecha.after(fecha2)){
                System.out.println("Fecha del usuario es despues que fecha2 (actual)");
            } else if (fecha.before(fecha2)){
                System.out.println("Fecha del usuario es anterior que fecha2 (fecha actual)");
            } else if (fecha.equals(fecha2)) {
                System.out.println("La fecha es la misma");
            }

            if (fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha del usuario es despues que fecha2 (actual)");
            } else if(fecha.compareTo(fecha2) < 0){
                System.out.println("Fecha del usuario es anterior que fecha2 (fecha actual)");
            } else if (fecha.compareTo(fecha2) == 0){
                System.out.println("La fecha es la misma");
            }

        } catch (ParseException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        scanner.close();
        
    }
}
