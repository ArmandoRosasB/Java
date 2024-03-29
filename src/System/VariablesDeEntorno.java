package System;

import java.util.Map;

public class VariablesDeEntorno {
    public static void main(String[] args) {
        Map<String, String> ambiente = System.getenv();
        System.out.println("----- Variables de ambiente del sistema -----");
        for(String key : ambiente.keySet()){
            System.out.println(key + "= " + ambiente.get(key));
        }
        System.out.println();
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);
        
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temp = System.getenv("TEMP");
        System.out.println("temp = " + temp);
        
        String path = System.getenv("PATH");
        System.out.println("path = " + path);
    }
}
