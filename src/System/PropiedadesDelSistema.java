package System;

import java.util.Properties;

public class PropiedadesDelSistema {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);
        
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workSpace = System.getProperty("user.dir");
        System.out.println("workSpace = " + workSpace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        Properties p = System.getProperties();
        System.out.println();
        p.list(System.out);
    }
}
