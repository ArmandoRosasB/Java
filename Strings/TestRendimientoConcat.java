public class TestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        // Conteo de tiempo metodo concat
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 10000; i++){
            c = c.concat(a).concat(b).concat("\n");    
        }

        long fin = System.currentTimeMillis();

        System.out.println("Tiempo de ejecucion utilizando concat: " + (fin - inicio) + "ms");
        
        inicio = System.currentTimeMillis();


        // Conteo de tiempo operador +

        for(int i = 0; i < 10000; i++){
            c += a + b + "\n"; 
        }

        fin = System.currentTimeMillis();
        
        System.out.println("Tiempo de ejecucion utilizando operador +: " + (fin - inicio) + "ms" );
    
    
        // Utilizando StringBuilder
        // MUTABLE!!!
        StringBuilder sb = new StringBuilder(c);

        inicio = System.currentTimeMillis();
  

        for(int i = 0; i < 10000; i++){
            sb.append(a).append(b).append("\n");
        }

        fin = System.currentTimeMillis();
        
        System.out.println("Tiempo de ejecucion utilizando StringBuilder: " + (fin - inicio) + "ms" );
 
        //System.out.println("sb = " + sb.toString());
    }
}
