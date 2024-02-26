package Introduccion;

public class PrimitivoCaracteres {
    public static void main(String[] args) {
        char caracter = 'a';
        System.out.println("caracter = " + caracter);
        
        char unicode = '\u0040';
        System.out.println("unicode = " + unicode);
        
        char ascii_code = 64;
        System.out.println("ascii_code = " + ascii_code);
        System.out.println(ascii_code + " == " + unicode + " = " + (unicode == ascii_code));

        System.out.println();
        System.out.println();


    }
}
