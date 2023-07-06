package Clases_Wrapper;

public class AutoboxingInteger {
    public static void main(String[] args) {
        Integer [] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int suma = 0;

        for(Integer num: enteros) {
            if (num.intValue() % 2 == 0){
                suma += num.intValue();
            }
        }

        System.out.println("suma = " + suma);

        suma = 0;

        for(Integer num: enteros) {
            if (num % 2 == 0){ // Autoboxing
                suma += num;
            }
        }

        System.out.println("suma = " + suma);
    }
}
