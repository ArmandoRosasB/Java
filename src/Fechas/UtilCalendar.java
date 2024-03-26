package Fechas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
        
public class UtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

        // Cambiar todos los valores del calendario
        // calendario.set(2020, Calendar.JANUARY, 24, 23, 1, 1);

        // Cambiar solo un dato
        calendario.set(Calendar.YEAR, 2023);
        calendario.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendario.set(Calendar.DAY_OF_MONTH, 28);
        //calendario.set(Calendar.HOUR_OF_DAY, 16);
        calendario.set(Calendar.HOUR, 4);
        calendario.set(Calendar.AM_PM, Calendar.PM);

        calendario.set(Calendar.MINUTE, 30);
        calendario.set(Calendar.SECOND, 30);
        calendario.set(Calendar.MILLISECOND, 120);

        Date fecha = calendario.getTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SS a");

        String fechaFormateada = df.format(fecha);

        System.out.println("La fecha sin formato de mi calendario es " + fecha);
        System.out.println("La fecha con formato de mi calendario es " + fechaFormateada);
        
    }
}
