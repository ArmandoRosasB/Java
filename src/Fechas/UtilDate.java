package Fechas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class UtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("La fecha de inicio es: " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy", new Locale("es", "MX"));
        String fechaStr = df.format(fecha);

        System.out.println("La fecha de inicio formateada es: " + fechaStr + "\n");

        long j = 0;
        for(int i = 0; i < 10000000; i++){
            j += i;
        }


        Date fechaFin = new Date();
        long tiempo = fechaFin.getTime() - fecha.getTime();

        System.out.println("Fecha de fin: " + fechaFin);
        System.out.println("Tiempo que tardo el ciclo: " + tiempo + " ms");


    }
}

