package String;

public class Rendimiento_de_concatenacion {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        System.out.println("Test de rendimiento");

        System.out.println("500 concatenaciones");
        long inicio = System.currentTimeMillis();
        long fin;

        System.out.print("Usando el operador +: ");
        for(int i = 0; i < 500; i++){
            c += a + b;
        }
        fin = System.currentTimeMillis();
        System.out.println((fin - inicio) + "ms");

        inicio = System.currentTimeMillis();

        System.out.print("Usando el metodo concat: ");
        for(int i = 0; i < 500; i++){
            c = c.concat(a).concat(b);
        }
        fin = System.currentTimeMillis();
        System.out.println((fin - inicio) + "ms");

        inicio = System.currentTimeMillis();

        System.out.print("Usando StringBuilder: ");
        StringBuilder sb = new StringBuilder(a);

        for(int i = 0; i < 500; i++){
            sb.append(b).append(c);
        }

        fin = System.currentTimeMillis();
        System.out.println((fin - inicio) + "ms");

        System.out.println();


        System.out.println("10000 concatenaciones");
        inicio = System.currentTimeMillis();

        System.out.print("Usando el operador +: ");
        for(int i = 0; i < 10000; i++){
            c += a + b;
        }
        fin = System.currentTimeMillis();
        System.out.println((fin - inicio) + "ms");

        inicio = System.currentTimeMillis();

        System.out.print("Usando el metodo concat: ");
        for(int i = 0; i < 10000; i++){
            c = c.concat(a).concat(b);
        }
        fin = System.currentTimeMillis();
        System.out.println((fin - inicio) + "ms");

        inicio = System.currentTimeMillis();

        System.out.print("Usando StringBuilder: ");
        StringBuilder sb2 = new StringBuilder(a);

        for(int i = 0; i < 10000; i++){
            sb2.append(a).append(b);
        }

        fin = System.currentTimeMillis();
        System.out.println((fin - inicio) + "ms");
    }
}
