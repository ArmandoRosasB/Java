package POO;

public class Automovil {
        private final int id;
        private String fabricante;
        private String modelo;
        private Color color;
        private TipoAutomovil tipo;
        private double cilindrada = 0;
        public static int total_autos;
        public static final int VELOCIDAD_MAXIMA_CARRETERA = 130;
        public static final  int VELOCIDAD_MAXIMA_CIUDAD = 80;

        public Automovil(String fabricante, String modelo, Color color, TipoAutomovil tipo){
                this.id = ++total_autos;
                this.fabricante = fabricante;
                this.modelo = modelo;
                this.color = color;
                this.tipo = tipo;
        }

        public Automovil(String fabricante, String modelo, Color color, TipoAutomovil tipo, double cilindrada){
                this(fabricante, modelo, color, tipo);
                this.cilindrada = cilindrada;
        }

        public String getFabricante() {
                return fabricante;
        }

        public String getModelo() {
                return modelo;
        }

        public Color getColor() {
                return color;
        }

        public double getCilindrada() {
                return cilindrada;
        }

        public TipoAutomovil getTipo(){
                return this.tipo;
        }

        public void setFabricante(String fabricante) {
                this.fabricante = fabricante;
        }

        public void setColor(Color color) {
                this.color = color;
        }

        public void setModelo(String modelo) {
                this.modelo = modelo;
        }

        public void setCilindrada(double cilindrada) {
                this.cilindrada = cilindrada;
        }

        public void setTipoAutomovil(TipoAutomovil tipo){
                this.tipo = tipo;
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
                sb.append("Id - ").append(this.id).append('\n');
                sb.append("Fabricante - ").append(this.fabricante).append('\n');
                sb.append("Modelo - ").append(this.modelo).append('\n');
                sb.append("Color - ").append(this.color).append('\n');
                sb.append("Tipo - ").append(this.tipo.getNombre()).append(" de ").append(this.tipo.getNumeroPuertas()).append(" puertas").append('\n');

                if (cilindrada != 0) {
                        sb.append("Cilindrada - ").append(this.cilindrada).append('\n');
                }

                return sb.toString();
        }

        @Override
        public boolean equals(Object other) {
                if (this == other) return true;
                if (!(other instanceof Automovil automovil)) return false;
                return (this.fabricante.equals(automovil.fabricante) && this.modelo.equals(automovil.modelo));
        }

}