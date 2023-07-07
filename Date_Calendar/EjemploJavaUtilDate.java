package Date_Calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date(); // Fecha actual

        System.out.println("fecha = " + fecha);

        /* SimpleDateFormat
         * DOCUMENTACION: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html
         * Simbolos para poder establecer un patron
         * dd -> numero de dia
         * MM -> numero de mes
         * MMMM -> nombre del mes
         * yyyy -> año
         * HH -> Horas
         * mm -> minutos
         * ss -> segundos
         * z -> zona horaria
         */

        SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        String fechaStr = df.format(fecha);

        long j = 0;

        for(int i = 0; i < 10000000; i++){
            j+= i;
        }

        System.out.println("j = " + j);
        Date fecha2 = new Date();

        // getTime() -> Obtiene el tiempo en milisegundos desde el 1 de Enero de 1970
        long tiempoFinal = fecha2.getTime() - fecha.getTime();

        System.out.println("Tiempo transcurrido en el for: " + tiempoFinal);

        System.out.println("fechaStr = " + fechaStr);
    }
}
