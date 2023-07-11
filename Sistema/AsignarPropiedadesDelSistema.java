package Sistema;

import java.io.FileInputStream;
import java.util.Properties;

public class AsignarPropiedadesDelSistema {
    public static void main(String[] args) {

        // Cargamos el archivo .properites

        try {
            FileInputStream archivo = new FileInputStream("config.properties");
            
            // Cargamos en nuestro objeto Properties todas las propiedades del sistema
            Properties p= new Properties(System.getProperties());
            
            // Cargamos las configuraciones de nuestro archivo
            p.load(archivo);

            // Agregar una propiedad a nuestro objeto sistema
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");


            // Actualizamos nuestra Clase System con las nuevas propiedades

            System.setProperties(p);
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(\"\") = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println("ps.getProperty(\"\") = " + ps.getProperty("config.autor.nombre"));


            ps.list(System.out);

        } catch (Exception e) {
            // TODO: handle exception

            // Mensaje de error
            System.err.println("No existe el archivo = " + e);
            System.exit(1); // 1 = Error
        }
        
    }
}
