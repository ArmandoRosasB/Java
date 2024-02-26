package Introduccion;

public class SistemasNumericos {
    public static void main(String[] args) {
        int bin = 0b10; // Representacion numero binario
        int oct = 070; // Representacion numeo octal
        int hex = 0xA342; // Representacion numero hexadecimal

        System.out.println("Numero binario: " + bin);
        System.out.println("Numero octal: " + oct);
        System.out.println("Numero hexadecimal: " + hex);
        System.out.println();


        int decimal = 21;

        System.out.println(decimal + " en binario es " + Integer.toBinaryString(decimal));
        System.out.println(decimal + " en octal es " + Integer.toOctalString(decimal));
        System.out.println(decimal + " en hexadecimal es " + Integer.toHexString(decimal));


    }
}
