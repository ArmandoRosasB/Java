public class OperadoresIncrementales {
    public static void main(String[] args) {
        
        // Preincremento
        int i = 1;
        System.out.println("Valor inicial de i = " + i);

        int j = ++i;
        
        System.out.println("Valor de i = " + i);
        System.out.println("Valor de j = " + j);

        System.out.println();

        // Postincremento
        i = 2;
        System.out.println("Valor inicial de i = " + i);
        j = i++;
        System.out.println("Valor de i = " + i);
        System.out.println("Valor de j = " + j);


        System.out.println();

        // Predecremento
        i = 3;
        System.out.println("Valor inicial de i = " + i);
        j = --i;
        System.out.println("Valor de i = " + i);
        System.out.println("Valor de j = " + j);


        System.out.println();

        // Postdecremento
        i = 4;
        System.out.println("Valor inicial de i = " + i);
        j = i--;
        System.out.println("Valor de i = " + i);
        System.out.println("Valor de j = " + j);


        System.out.println();

        System.out.println("++j = " + (++j));
        System.out.println("j++ = " + (j++));

        System.out.println("j = " + (j));

    }
}
