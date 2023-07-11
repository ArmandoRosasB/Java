import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");


        System.out.print("Ingresa tu fecha de nacimiento (dd/MM/YYYY): ");

        try {
            Date fechaNacimiento = df.parse(scanner.nextLine());
            Date hoy = new Date();

            int anioHoy, mesHoy, diaHoy;
            int anioNacimiento, mesNacimiento, diaNacimiento;

            int edad;

            String [] splitNacimiento = df.format(fechaNacimiento).split("/");
            String [] splitHoy = df.format(hoy).split("/");

            anioHoy = Integer.parseInt(splitHoy[2]);
            mesHoy = Integer.parseInt(splitHoy[1]);
            diaHoy = Integer.parseInt(splitHoy[0]);

            anioNacimiento = Integer.parseInt(splitNacimiento[2]);
            mesNacimiento = Integer.parseInt(splitNacimiento[1]);
            diaNacimiento = Integer.parseInt(splitNacimiento[0]);

            if (mesNacimiento == mesHoy) {
                if (diaHoy >= diaNacimiento){
                    edad = anioHoy - anioNacimiento;
                } else {
                    edad = anioHoy - anioNacimiento - 1;
                }
            } else {
                if (mesHoy >= mesNacimiento){
                    edad = anioHoy - anioNacimiento;
                } else {
                    edad = anioHoy - anioNacimiento - 1;
                }
            }
            
            System.out.println("Tu edad es " + edad + " a\u00F1os");

        } catch (ParseException e) {
            // TODO: handle exception
            System.out.println("Error en el formato");
        }



        scanner.close();
    }
}
