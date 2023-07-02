import javax.swing.JOptionPane;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;

        System.out.println("Suma: i + j = " + suma);
        System.out.println("Suma: i + j = " + (i + j));

        int resta = i - j;

        System.out.println("Resta: i + j = " + resta);
        System.out.println("Resta: i + j = " + (i - j));

        int multi = i * j;

        System.out.println("Multiplicacion: i * j = " + multi);
        System.out.println("Multiplicacion: i * j = " + (i * j));

        int div = i / j;
        float div2 = i / j;
        float div3 = (float) i / j;

        System.out.println("Division: i / j = " + div);
        System.out.println("Division: i / j = " + (i / j));

        System.out.println("Division flotante sin cast: i / j = " + div2);
        System.out.println("Division flotante con cast: i / j = " + div3);

        int mod = i % j;
        System.out.println("Modulo: i % j = " + mod);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        if (numero % 2 == 0){
            System.out.println("Numero par = " + numero);
        } else {
            System.out.println("Numero impar = " + numero);
        }
    }
}