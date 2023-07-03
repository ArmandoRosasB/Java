import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        // FORMA 1

        // String [] usernames = new String[3];
        // String [] passwords = new String[3];

        // usernames[0] = "Armando";
        // usernames[1] = "admin";
        // usernames[2] = "Pepe";
        
        // passwords[0] = "12345";
        // passwords[1] = "12345";
        // passwords[2] = "12345";



        // FORMA 2

        // String username = "Armando";
        // String password = "12345";

        // String username2 = "admin";
        // String password2 = "12345";



        // FORMA 3

        String [] usernames = {"Armando", "admin", "Pepe"};
        String [] passwords = {"12345", "12345", "12345"};


 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre de usuario: ");
        String u = scanner.nextLine();

        System.out.print("Ingrese el password: ");
        String p = scanner.nextLine();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++){
            if (usernames[i].equals(u) && passwords[i].equals(p)){
                esAutenticado = true;
                break;
            } 
        }

        // PARA LA FORMA 2

        // if ( username.equals(u) && password.equals(p) || username2.equals(u) && password2.equals(p) ){
        //     esAutenticado = true;
        // } else {
        //     System.out.println("Username o password incorrectos");
        // }

        if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Lo siento, requiere autenticacion");
        }


        scanner.close();
    }
}