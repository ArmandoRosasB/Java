package POO;

public class Automovil implements Comparable<Automovil> {
        private final int id;
        private int indice_ruedas = 0;

        private String fabricante;
        private String modelo;
        private Color color;

        private Motor motor;
        private TipoAutomovil tipo;
        private Tanque tanque;
        private Persona conductor;
        private Rueda[] ruedas;

        public static int total_autos;
        public static final int VELOCIDAD_MAXIMA_CARRETERA = 130;
        public static final  int VELOCIDAD_MAXIMA_CIUDAD = 80;

        public Automovil () {
                this.id = ++total_autos;
                this.fabricante = "Toyota";
                this.modelo = "Corola";
                this.color = Color.BLANCO;
                this.tipo = TipoAutomovil.FAMILIAR;
        }
        public Automovil(String fabricante, String modelo, Color color, TipoAutomovil tipo){
                this.id = ++total_autos;
                this.fabricante = fabricante;
                this.modelo = modelo;
                this.color = color;
                this.tipo = tipo;
        }

        public Automovil(String fabricante, String modelo, Color color, TipoAutomovil tipo, Motor motor){
                this(fabricante, modelo, color, tipo);
                this.motor = motor;
        }

        public Automovil(String fabricante, String modelo, Color color, TipoAutomovil tipo, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas){
                this(fabricante, modelo, color, tipo, motor);
                this.tanque = tanque;
                this.conductor = conductor;
                this.ruedas = ruedas;
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

        public Motor getMotor() {
                return motor;
        }

        public TipoAutomovil getTipo(){
                return this.tipo;
        }

        public Persona getConductor() { return this.conductor; }

        public Rueda [] getRuedas() { return this.ruedas; }

        public void setFabricante(String fabricante) {
                this.fabricante = fabricante;
        }

        public void setColor(Color color) {
                this.color = color;
        }

        public void setModelo(String modelo) {
                this.modelo = modelo;
        }

        public void setCilindrada(Motor cilindrada) {
                this.motor = cilindrada;
        }

        public void setTipoAutomovil(TipoAutomovil tipo){
                this.tipo = tipo;
        }

        public void setConductor (Persona conductor) {this.conductor = conductor; }

        public void setRuedas (Rueda [] ruedas) { this.ruedas = ruedas; }

        public Automovil addRueda (Rueda rueda){
                if (ruedas == null){
                        ruedas = new Rueda[5];
                }
                if (indice_ruedas < ruedas.length) {
                        ruedas[indice_ruedas++] = rueda;
                }

                return this;
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

                if (motor != null) {
                        sb.append("Motor - ").append("\n\t").append("Cilindrada - ").append(this.motor.getCilindrada()).append("\n\t").append("Tipo - ").append(this.motor.getTipo()).append('\n');
                }

                if (tanque != null){
                        sb.append("Capacidad del tanque - ").append(tanque.getCapacidad()).append('\n');
                }

                if (conductor != null) {
                        sb.append("Conductor - ").append(this.conductor).append('\n');
                }

                if (ruedas != null) {
                        for(int i = 0; i < ruedas.length; i++){
                                sb.append("Rueda ").append(i + 1).append("- ").append("\n\t")
                                        .append("Fabricante - ").append(ruedas[i].getFabricante()).append("\n\t")
                                        .append("Ancho - ").append(ruedas[i].getAncho()).append("\n\t")
                                        .append("Aro - ").append(ruedas[i].getAro())
                                        .append('\n');
                        }
                }
                return sb.toString();
        }

        @Override
        public boolean equals(Object other) {
                if (this == other) return true;
                if (!(other instanceof Automovil automovil)) return false;
                return (this.fabricante.equals(automovil.fabricante) && this.modelo.equals(automovil.modelo));
        }

        @Override
        public int compareTo(Automovil other){
                return this.fabricante.compareTo(other.getFabricante());
        }

}
