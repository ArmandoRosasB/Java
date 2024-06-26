package System;


public class EjecutarPrograma {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try{
            if(System.getProperty("os.name").toLowerCase().startsWith("windows")){
                proceso = rt.exec("notepad"); // Ejecutar la aplicacion notepad
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")){
                proceso = rt.exec("textedit");
            } else {
                proceso = rt.exec("gedit");
            }
            proceso.waitFor(); // Esperar a que la aplicacion haya sido cerrada
        } catch (Exception e) {
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
