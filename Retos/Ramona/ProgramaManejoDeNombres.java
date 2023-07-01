
// 2da versión

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        String nombre1, nombre2, nombre3;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un nombre: ");
        nombre1 = scanner.nextLine();

        System.out.print("Ingresa otro nombre: ");
        nombre2 = scanner.nextLine();

        System.out.print("Ingresa un último nombre: ");
        nombre3 = scanner.nextLine();

        StringBuilder sb = new StringBuilder("");
        sb.append(nombre1.toUpperCase().charAt(1)).append('.').append(nombre1.substring(nombre1.length()-2));
        String cambio1 = sb.toString();

        sb = new StringBuilder("");
        sb.append(nombre2.toUpperCase().charAt(1)).append('.').append(nombre2.substring(nombre2.length()-2));
        String cambio2 = sb.toString();

        sb = new StringBuilder("");
        sb.append(nombre3.toUpperCase().charAt(1)).append('.').append(nombre3.substring(nombre3.length()-2));
        String cambio3 = sb.toString();

        sb = new StringBuilder(cambio1);
        sb.append('_').append(cambio2).append('_').append(cambio3);

        String respuesta = sb.toString();
        System.out.println('\n' + respuesta);
        
        scanner.close();
    }
}

// 1ra versión

/*
import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        String nombre1, nombre2, nombre3;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un nombre: ");
        nombre1 = scanner.nextLine();

        System.out.print("Ingresa otro nombre: ");
        nombre2 = scanner.nextLine();

        System.out.print("Ingresa un último nombre: ");
        nombre3 = scanner.nextLine();

        StringBuilder sb = new StringBuilder("");
        sb.append(nombre1.toUpperCase().charAt(1));
        sb.append('.');
        sb.append(nombre1.charAt(nombre1.length()-2));
        sb.append(nombre1.charAt(nombre1.length()-1));
        String cambio1 = sb.toString();

        sb = new StringBuilder("");
        sb.append(nombre2.toUpperCase().charAt(1));
        sb.append('.');
        sb.append(nombre2.charAt(nombre2.length()-2));
        sb.append(nombre2.charAt(nombre2.length()-1));
        String cambio2 = sb.toString();

        sb = new StringBuilder("");
        sb.append(nombre3.toUpperCase().charAt(1));
        sb.append('.');
        sb.append(nombre3.charAt(nombre3.length()-2));
        sb.append(nombre3.charAt(nombre3.length()-1));
        String cambio3 = sb.toString();

        sb = new StringBuilder(cambio1);
        sb.append('_');
        sb.append(cambio2);
        sb.append('_');
        sb.append(cambio3);

        String respuesta = sb.toString();
        System.out.println('\n' + respuesta);
        
        scanner.close();
    }
}
*/
