package System;

import java.io.FileInputStream;
import java.util.Properties;

public class AsignarPropiedadesDelSistema {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("src/System/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(input);
            p.setProperty("config.property.personalized", "Mi valor guardado en el objeto properties");

            System.setProperties(p);

        } catch (Exception e) {
            System.err.println("No existe el archivo = " + e); // Mensaje de error
            System.exit(1); // Terminar el programa
        }

        System.out.println("Mi propiedad personalizada = " + System.getProperty("config.property.personalized\n"));
        System.getProperties().list(System.out);

    }
}
