import javax.swing.JOptionPane;

public class NombreMasLargo {
    public static void main(String[] args) {
        String nombre1, nombre2, nombre3;
        String resultado;

        nombre1 = JOptionPane.showInputDialog(null, "Persona 1: Ingresa tu nombre completo");
        nombre2 = JOptionPane.showInputDialog(null, "Persona 2: Ingresa tu nombre completo");
        nombre3 = JOptionPane.showInputDialog(null, "Persona 3: Ingresa tu nombre completo");
    
        
        resultado = (nombre1.split(" ")[0].length() > nombre2.split(" ")[0].length())? nombre1 : nombre2;
        resultado = (resultado.split(" ")[0].length() > nombre3.split(" ")[0].length())? resultado : nombre3;

        System.out.println(resultado + " tiene el nombre mas largo.");
        
    }
}
