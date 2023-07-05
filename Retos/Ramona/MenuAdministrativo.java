
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

public class MenuAdministrativo {
    public static void main(String[] args) {
        // Map: arreglo asociativo (nombre/índice - valor)
        //  También conocido como diccionario (para almacenar datos en base a un nombre)
        Map<String, Integer> opciones = new HashMap<String, Integer>();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);
        
        Object[] opArreglo = opciones.keySet().toArray();
        String title = "Mantenedor de Productos";
        int opcionIndice = 0;

        while(true) {
            Object opcion = JOptionPane.showInputDialog(null,
                            "Seleccione un Opción", 
                            title, 
                            JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);
            
            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());
                
                switch(opcionIndice) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente", title, 1);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente", title, 1);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Usuario agregado correctamente", title, 1);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Usuario listado correctamente", title, 1);
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "¡Haz salido con éxito!", title, 1);
                        System.exit(0);
                }
            }
        }
    }
}
