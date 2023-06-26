import javax.swing.JOptionPane;

public class SistemasNumericos {
    public static void main(String[] args) {
        
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero", "Message");
        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }
        

        System.out.println("Numero decimal = " + numeroDecimal);

        String mensajeBinario = "\nNumero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        // Sistema binario
        System.out.println(mensajeBinario);
        int numeroBinario = 0b111110100; // 0b -> binario
        System.out.println("Numero binario = " + numeroBinario);

        String mensajeOctal = "\nNumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        
        // Sistema octal
        System.out.println(mensajeOctal);
        int numeroOctal = 0764; // 0 -> Octal
        System.out.println("Numero octal = " + numeroOctal);

        String mensajeHex = "\nNumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        // Sistema hexadecimal
        System.out.println(mensajeHex);
        int numeroHex = 0x1f4; // 0x -> Hexadecimal
        System.out.println("Numero hexadecimal = " + numeroHex);


        String mensaje = mensajeBinario;
        mensaje += mensajeOctal;
        mensaje += mensajeHex;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}