public class SentenciaSwitchCase {
    public static void main(String[] args) {
        int num = 3;

        
        // Acepta byte, short, int, char, enum y String (java 7)
        switch(num) {
            case 0:
                System.out.println("El numero es cero");
                break;
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                break;
            default:
                System.out.println("El numero no es ni uno ni dos ni tres");
                break;
        }

        String nombre = "Pepe";

        switch (nombre) {
            case "admin":
                System.out.println("Hola admin, bienvenido");
                break;
            case "Armando":
                System.out.println("Hola Armando");
                break;
            case "Pepe":
                System.out.println("Hola pepe");
                break;
            default:
                System.out.println("Usuario desconocido");
                break;
        }
    }
}
