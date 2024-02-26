package Introduccion;

public class ConversionEntreTipos {
    public static void main(String[] args) {

        // Cadenas a (enteros|reales|logicos)

        String numeroStr = "50";
        int numero = Integer.parseInt(numeroStr);

        System.out.println("numero = " + numero);
        
        
        String realStr = "12.34";
        double real = Double.parseDouble(realStr);

        System.out.println("real = " + real);
        
        String logicoStr = "true";
        boolean logico = Boolean.parseBoolean(logicoStr);

        System.out.println("logico = " + logico);

        // (enteros|reales|logioos) a cadenas

        int otroNumeroEntero = 100;
        System.out.println("otroNumeroEntero = " + otroNumeroEntero);

        String otroNumeroStr = Integer.toString(otroNumeroEntero);

        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroEntero);
        System.out.println("otroNumeroStr = " + otroNumeroStr);


        double otroNumeroReal = 123.321;
        String otroRealStr= Double.toString(otroNumeroReal);

        System.out.println("otroRealStr = " + otroRealStr);
        
        otroRealStr = String.valueOf(otroNumeroReal);
        System.out.println("otroRealStr = " + otroRealStr);


        // Conversion entre tipos numericos
        /*
        Tener cuidados con la conversion de tipos de datos mas grandes
        a tipos de datos mas pequenos

        */

        int i = 1000;
        short s = (short) i; // Tener cuidado con la perdida de datos
        System.out.println("s = " + s);

        long l = i;
        System.out.println("l = " + l);
        
        char c = (char) i;
        System.out.println("c = " + c);
        
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
