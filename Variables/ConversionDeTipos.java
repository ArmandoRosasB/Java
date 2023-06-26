public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        // str a int
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("Numero Int = " + numeroInt);


        String realSrt = "98765.43e-3";
        double realDouble = Double.parseDouble(realSrt);
        System.out.println("Real Double = " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("Logico Boolean = " + logicoBoolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        // Otra manera de convertir a String
        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 32768;

        // Cast: Forzamos la conversion
        short s = (short) i;
        System.out.println("s = " + s);

        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);

        char c = (char) i;
        System.out.println("c = " + c);

        float f = (float) i;
        System.out.println("f = " + f);
    }
}
