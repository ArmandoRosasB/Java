
import javax.swing.JOptionPane;

public class NombreMasLargo {
    public static void main(String[] args) {
        String nombre1 = "", nombre2 = "", nombre3 = "", mayor = "", title = "Nombre más largo";

        nombre1 = JOptionPane.showInputDialog(null, "Ingresa el nombre completo de un amigo o familiar", title, 3);
        nombre2 = JOptionPane.showInputDialog(null, "Ingresa el nombre completo de otro amigo o familiar", title, 3);
        nombre3 = JOptionPane.showInputDialog(null, "Ingresa el nombre completo de un último amigo o familiar", title, 3);

        mayor = (nombre1.split(" ")[0].length() > nombre2.split(" ")[0].length())?nombre1:nombre2;
        mayor = (mayor.split(" ")[0].length() > nombre3.split(" ")[0].length())?mayor:nombre3;

        JOptionPane.showMessageDialog(null, mayor + " tiene el nombre más largo", title, 1);
    }
}
