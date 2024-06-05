package POO;

public class Rueda {
    private String fabricante;
    private int aro;
    private double ancho;

    public Rueda (String fabricante, int aro, double ancho) {
        this.fabricante = fabricante;
        this.aro = aro;
        this.ancho = ancho;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public int getAro(){
        return this.aro;
    }

    public double getAncho(){
        return this.ancho;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public void setAro(int aro){
        this.aro = aro;
    }

    public void setAncho(double ancho){
        this.ancho = ancho;
    }
}
