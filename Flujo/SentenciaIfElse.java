public class SentenciaIfElse {
    public static void main(String[] args) {
        float promedio = 5.5f;

        // Llaves no obligatorias si solo se lleva a cabo una sentencia
        if (promedio >= 6.5){
            System.out.println("Felicitaciones, excelente promedio");
        } else if (promedio >= 6.0){
            System.out.println("Muy buen promedio");
        } else if (promedio >= 5.5){
            System.out.println("Buen promedio");
        } else if (promedio >= 5.0){
            System.out.println("Regular, necesitas esforzarte un poco mas");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente, necesitas estudiar mas");
        } else {
            System.out.println("Reprobado");
        }

        System.out.println("Tu promedio es: " + promedio);
    }
}
