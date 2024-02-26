package Introduccion;

public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte _byte = 127;
        System.out.println("_byte = " + _byte);
        System.out.println("Un byte corresponde a " + Byte.SIZE);
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);
        System.out.println();

        short _short = 128;
        System.out.println("_short = " + _short);
        System.out.println("Un short corresponde a " + Short.SIZE);
        System.out.println("Valor maximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short: " + Short.MIN_VALUE);
        System.out.println();

        int _int = 32768;
        System.out.println("_int = " + _int);
        System.out.println("Un int corresponde a " + Integer.SIZE);
        System.out.println("Valor maximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int: " + Integer.MIN_VALUE);
        System.out.println();

        long _long = 2147483648L;
        System.out.println("_long = " + _long);
        System.out.println("Un long corresponde a " + Long.SIZE);
        System.out.println("Valor maximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un long: " + Long.MIN_VALUE);
        System.out.println();


    }
}
