import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String amigo_1, amigo_2, amigo_3;

        System.out.print("Digita el nombre de uno de tus amigos: ");
        amigo_1 = scanner.nextLine();

        System.out.print("Digita el nombre de otro de tus amigos: ");
        amigo_2 = scanner.nextLine();

        System.out.print("Digita el nombre de otro de tus amigos: ");
        amigo_3 = scanner.nextLine();

        StringBuilder codigo_1 = new StringBuilder("");
        StringBuilder codigo_2 = new StringBuilder("");
        StringBuilder codigo_3 = new StringBuilder("");

        codigo_1.append(amigo_1.substring(1, 2).toUpperCase()).append('.').append(amigo_1.substring(amigo_1.length() - 2));
        codigo_2.append(amigo_2.substring(1, 2).toUpperCase()).append('.').append(amigo_2.substring(amigo_2.length() - 2));
        codigo_3.append(amigo_3.substring(1, 2).toUpperCase()).append('.').append(amigo_3.substring(amigo_3.length() - 2));

        String s1 = codigo_1.toString(), 
               s2 = codigo_2.toString(),
               s3 = codigo_3.toString();
    
        StringBuilder sb = new StringBuilder("");
        
        sb.append(s1).append('_').append(s2).append('_').append(s3);
        
        String resultado = sb.toString();

        System.out.println();
        System.out.println(resultado);


        scanner.close();
    }
}