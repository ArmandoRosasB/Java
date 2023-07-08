package Sistema;

import java.util.Properties;

public class PropiedadesDelSistema {
    public static void main(String[] args) {
        // Obtener el username del usuario
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        // User home directory
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        // Obtener la carpeta actua
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        // Obtener la version de java
        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        // Salto de linea
        String lineseparator = System.getProperty("line.separator");
        System.out.println("lineSeparator:" + lineseparator + "Una linea nueva");
        System.out.println();
        
        // Propiedades del sistema
        Properties p = System.getProperties();
        p.list(System.out);
    }
}
