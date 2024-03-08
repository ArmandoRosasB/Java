package Operadores;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String [] users = {"Armando", "Admin", "Ramona"};
        String [] passwords = {"12345", "67890", "0000"};

        Scanner scanner = new Scanner(System.in);

        String u, p;

        System.out.print("Ingresa tu username: ");
        u = scanner.next();

        System.out.print("Ingresa tu password: ");
        p = scanner.next();

        boolean esAutenticado = false;

        for(int i = 0; i < users.length; i++){
            if (users[i].equals(u) && passwords[i].equals(p)){
                esAutenticado = true;
                break;
            }
        }

        if (esAutenticado){
            System.out.println("Bienvenid@ " + u + "!");
        } else {
            System.out.println("Uusuario o password incorrectos");
        }

    }
}
