package POO;

public class Automovil {
        private String fabricante;
        private String modelo;
        private String color;
        private double cilindrada;

        public Automovil(){
                this.fabricante = "Ford";
                this.modelo = "Mustang";
                this.color = "Blanco";
                this.cilindrada = 5.5;

        }

        public Automovil(String fabricante, String modelo, String color){
                this.fabricante = fabricante;
                this.modelo = modelo;
                this.color = color;
        }

        public Automovil(String fabricante, String modelo, String color ,double cilindrada){
                this(fabricante, modelo, color);
                this.cilindrada = cilindrada;
        }

        public String getFabricante() {
                return fabricante;
        }

        public String getModelo() {
                return modelo;
        }

        public String getColor() {
                return color;
        }

        public double getCilindrada() {
                return cilindrada;
        }

        public void setFabricante(String fabricante) {
                this.fabricante = fabricante;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public void setModelo(String modelo) {
                this.modelo = modelo;
        }

        public void setCilindrada(double cilindrada) {
                this.cilindrada = cilindrada;
        }

        public String acelerar(int rpm){
                return "Auto " + this.fabricante + ' ' + this.modelo + " acelerando a " + rpm + " rpm";
        }

        public String frenar(){
                return "Auto " + this.fabricante + ' ' + this.modelo + " frenando";
        }

        @Override
        public String toString() {
                StringBuilder sb = new StringBuilder();

                sb.append("Detalles del auto:\n");
                sb.append("Fabricante - ").append(this.fabricante).append('\n');
                sb.append("Modelo - ").append(this.modelo).append('\n');
                sb.append("Color - ").append(this.color).append('\n');

                return sb.toString();
        }

}
