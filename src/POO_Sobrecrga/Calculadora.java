package POO_Sobrecrga;

public class Calculadora {
    private Calculadora (){

    }

    public static int sumar(int a, int b){
        return a + b;
    }

    public static int sumar(int a, int b, int c){
        return a + b + c;
    }

    public static int sumar(int... args){
        int resultado = 0;
        for(int argumento: args){
            resultado += argumento;
        }
        return resultado;
    }

    public static float sumar(float a, int... args){
        float resultado = a;
        for(int arg: args){
            resultado += arg;
        }
        return resultado;
    }

    public static float sumar(float a, int b){
        return a + b;
    }

    public static float sumar(int a, float b){
        return a + b;
    }

    public static float sumar (float a, float b){
        return a + b;
    }

    public static double sumar(double a, double b){
        return a + b;
    }

    public static double sumar (double... args){
        double resultado = 0;
        for(double arg: args){
            resultado += arg;
        }
        return resultado;
    }

    public static long sumar(long a, long b){
        return a + b;
    }

    public static double sumar(String a, String b){
        double resultado;

        try {
            resultado = Double.parseDouble(a) + Double.parseDouble(b);
        } catch (NumberFormatException e){
            resultado = 0;
        }

        return resultado;
    }
}
