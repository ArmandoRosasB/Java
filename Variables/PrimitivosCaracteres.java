public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = 'A'; 
        System.out.println("Caracter: " + caracter);

        char unicode = '\u0040'; // \u0040 -> Caracter unicode para @
        System.out.println("Caracter unicode: " + unicode);

        char decimal = 64;
        System.out.println("Decimal: " + decimal);
        System.out.println("decimal == unicode: " + (decimal == unicode));

        char simbolo = '@';
        System.out.println("Simbolo: " + simbolo);
        System.out.println("simbolo == unicode: " + (simbolo == unicode));

        // Caracteres especiales
        char espacio = ' ';
        char espacioUnicode = '\u0020';

        char retroceso = '\b'; //retroceder un espacio
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r'; // Reinicio de linea (Maquina de escribir)



        System.out.println("char corresponde en byte:" + nuevaLinea + retornoCarro + Character.BYTES);
        System.out.println("char corresponde en bites:" + espacioUnicode + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);

        // Usando propiedades del sistema
        System.out.println("Voy a saltar de linea " + System.getProperty("line.separator"));
        System.out.println("Ves?");
        System.out.println("Voy a saltar de linea otra vez" + System.lineSeparator());
        System.out.println("Ves?");
        
    }
}