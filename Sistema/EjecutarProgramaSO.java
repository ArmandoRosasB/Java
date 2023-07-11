package Sistema;

public class EjecutarProgramaSO {
    public static void main(String[] args) {

        // Nos permite ejecutar aplicaciones
        Runtime rt = Runtime.getRuntime();
        Process proceso;
        
        try {
            
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")){
                proceso = rt.exec("notepad"); // Ejecuta un programay regresa una instancia de tipo Process

            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                proceso = rt.exec("textedit");

            } else if (System.getProperty("os.name").toLowerCase().contains("nix") || 
                System.getProperty("os.name").toLowerCase().contains("nux")){
                proceso = rt.exec("gedit");
            } else { // Linux
                proceso = rt.exec("gedit");
            }

            proceso.waitFor(); // Esperar a que finalice la aplicacion

        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
    }
}
