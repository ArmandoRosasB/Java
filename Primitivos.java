public class Primitivos {
    public static void main(String[] args) {
        
        byte numeroByte = 127;
        System.out.println("Numero byte: " + numeroByte);
        System.out.println("Tipo byte corresponde en bytes a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bits a " + Byte.SIZE);
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);

        System.out.println();

        short numeroShort = 32767;
        System.out.println("Numero short: " + numeroShort);
        System.out.println("Tipo short corresponde en bytes a " + Short.BYTES);
        System.out.println("Tipo short corresponde en bits a " + Short.SIZE);
        System.out.println("Valor maximo de un byte: " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Short.MIN_VALUE);

        System.out.println();

        int numeroInt = 2147483647;
        System.out.println("Numero int: " + numeroInt);
        System.out.println("Tipo int corresponde en bytes a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bits a " + Integer.SIZE);
        System.out.println("Valor maximo de un byte: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Integer.MIN_VALUE);

        System.out.println();

        long numeroLong = 9223372036854775807L; // L al final para definir un numero como Long
        System.out.println("Numero long: " + numeroLong);
        System.out.println("Tipo long corresponde en bytes a " + Long.BYTES);
        System.out.println("Tipo long corresponde en bits a " + Long.SIZE);
        System.out.println("Valor maximo de un byte: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Long.MIN_VALUE);

        System.out.println();
         
    }
}
