public class SentenciaFor {
    public static void main(String[] args) {
        
        for(int i = 0; i <= 5; i++){
            System.out.println("i = " + i);
        }

        System.out.println();
        int i = 0;
        

        for (;;){
            if (i > 5){
                break;
            }

            System.out.println("i = " + i);
            i++;
        }
        System.out.println();

        for (int k = 1, j = 10;  k < j; k++, j--){
            System.out.println(k + " - " + j);
        }

        System.out.println();

        for(int k = 0; k <= 10; k++){
            if (!(k % 2 == 0)){
                continue;
            }

            System.out.println("k = " + k);
        }

        
    }
}
