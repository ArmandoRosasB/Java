package Sistema;
import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        // Obtener las variables de entorno del sistema
        Map<String, String> varEnv = System.getenv();
        
        System.out.println("-----Listado de variables de entorno------");


        for(String key : varEnv.keySet()){
            System.out.println(key + "= " + varEnv.get(key));
        }
        System.out.println();
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String path = System.getenv("PATH");
        System.out.println("Path = " + path);

        String path2 = varEnv.get("PATH");
        System.out.println("path2 = " + path2);

        String applicationEnv = varEnv.get("APPLICATION_ENV");
        System.out.println("appEnv = " + applicationEnv);
        
    }
}
