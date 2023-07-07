package Date_Calendar;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance(); // Invocamos y creamos una instancia
        
        // Indicar una fecha en particular
        // NOTA: LOS MESES COMIENZAN EN 0
        // calendario.set(anio, mes, dia, hora, minutos, segundos)

        calendario.set(1970, Calendar.DECEMBER, 25, 19, 20, 10);

        // POR PARTES
        //calendario.set(Constante(YEAR, MONTH...), numero)
        calendario.set(Calendar.YEAR, 1980);
        calendario.set(Calendar.MONTH, Calendar.OCTOBER);

        calendario.set(Calendar.HOUR, 9);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);


        
        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);

        // Formato 12 horas
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss a");
        String fechaConFormato = sd.format(fecha);

        System.out.println("fecha con formato: " + fechaConFormato);
    
    }
}
