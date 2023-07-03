import java.util.Scanner;

public class OperadoresLoginTernario {
    public static void main(String[] args) {


        String [] usernames = {"Armando", "admin", "Pepe"};
        String [] passwords = {"12345", "12345", "12345"};


 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre de usuario: ");
        String u = scanner.nextLine();

        System.out.print("Ingrese el password: ");
        String p = scanner.nextLine();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++){
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado;
            
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") : 
            "Username o password incorrecto\nLo siento, requiere autenticacion";

        System.out.println(mensaje);


        scanner.close();
    }
}
