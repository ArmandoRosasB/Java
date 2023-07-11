package Sistema;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjecutarComando {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try {
            proceso = rt.exec("neofetch"); // Ejecuta el comando

            StringBuilder sb = new StringBuilder();
            BufferedReader br = new BufferedReader(new InputStreamReader(proceso.getInputStream()));

            String line;

            while ((line = br.readLine()) != null){
                sb.append(line + '\n');
            }

            int exitVal = proceso.waitFor();

            if (exitVal == 0) {
                System.out.println("Success");
                System.out.println(sb.toString());
                System.exit(0);
            } else {
                System.err.println("Something went wrong :(");
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
