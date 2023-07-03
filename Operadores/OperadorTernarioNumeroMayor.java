import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        int max = 0;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int num1 = s.nextInt();

        System.out.print("Ingrese un numero: ");
        int num2 = s.nextInt();

        System.out.print("Ingrese un numero: ");
        int num3 = s.nextInt();

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;

        System.out.println("Max: " + max);


        int [] nums = {11, 44, 1, 4, 5, 7};
        max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            max = (nums[i]) > max ? nums[i] : max;
        }

        System.out.println("Max : " + max);
        s.close();
    }
}
