public class BuscarExtension {
    public static void main(String[] args) {
        String archivo = "CursoJava.pdf";
        String archivo_dos = "HelloWorld.java";

        int i = archivo.lastIndexOf(".");
        int j = archivo_dos.lastIndexOf(".");

        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo_dos.length() = " + archivo_dos.length());

        System.out.println("Extension del archivo = " + archivo.substring(i + 1));
        System.out.println("Extension del archivo_dos = " + archivo_dos.substring(j + 1));
        
    }
}
