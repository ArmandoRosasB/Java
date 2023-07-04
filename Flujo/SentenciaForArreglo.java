import javax.swing.JOptionPane;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String [] nombres = {"Armando", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato"};
        int count = nombres.length;

        for(int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase("Armando") || 
                nombres[i].equalsIgnoreCase("Pepe")) {
                
                continue;
            }
            System.out.println(i + ".- " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingresa un nombre");

        boolean encontrado = false;
        for(int i = 0; i < count; i++){
            encontrado = (nombres[i].equalsIgnoreCase(buscar)) ? true : encontrado;
        }


        if (encontrado) {
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema");
        }
    }
}
