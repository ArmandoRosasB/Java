package POO;

public class Motor {
    private double cilindrada;
    private TipoMotor tipo;

    public Motor(double cilindrada, TipoMotor tipo){
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    public double getCilindrada(){
        return this.cilindrada;
    }

    public TipoMotor getTipo(){
        return tipo;
    }

    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }
}
