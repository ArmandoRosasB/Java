package Flujo_de_control;

public class SentenciaFor {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){
            System.out.println("i= " + i);
        }
        System.out.println();

        for(int i = 10; i >= 0; i--){
            System.out.println("i= " + i);
        }
        System.out.println();

        System.out.println("i   j");
        for(int i = 0, j = 10; i <= j; i++, j--){
            System.out.println(i + " - " + j);
        }
    }
}
