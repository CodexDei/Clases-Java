import javax.swing.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class Automovil implements Comparable {

    //Atributos No estaticos
    private int idAutomovil;
    private TipoAutomovil tipo;
    private String marca;
    private Integer modelo;
    private int precio;
    private Color color;
    private Motor motor;
    private Tanque tanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;
    private int velocidad;
    private int rendimiento;
    private String transmision;

    //Atributos estaticos
    private static int ultimoId = 1000;
    private static int contadorAutomoviles;

    //Constantes
    private static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    private static final int VELOCIDAD_MAX_CIUDAD = 60;
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_GRIS = "Gris";

    //Constructores
    //Sobrecarga de constructores: hace referencia a tener varios constructores con o sin parametros, si con
    //parametros pueden ser con distintos parametros
    //Constructor sin parametros
    public Automovil(){
        this.idAutomovil = ++ultimoId;
        this.ruedas = new Rueda[5];
        contadorAutomoviles++;
    }

    //constructor con parametros
    public Automovil(TipoAutomovil tipo, String marca, Persona conductor, int modelo, int precio, Color color, Motor motor, Tanque tanque,
                      Rueda[] ruedas, int velocidad, int rendimiento, String transmision) {

        this();
        this.tipo = tipo;
        this.marca = marca;
        this.conductor = conductor;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.motor = motor;
        this.tanque = tanque;
        this.ruedas = ruedas;
        this.velocidad = velocidad;
        this.rendimiento = rendimiento;
        this.transmision = transmision;
    }

    public Automovil(TipoAutomovil tipo, String marca, Persona conductor, int modelo, int precio, Color color, Motor motor, Tanque tanque,
                     int velocidad, int rendimiento, String transmision) {
        this();
        this.tipo = tipo;
        this.marca = marca;
        this.conductor = conductor;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.motor = motor;
        this.tanque = tanque;
        this.velocidad = velocidad;
        this.rendimiento = rendimiento;
        this.transmision = transmision;
    }
    public Automovil(String marca, int modelo){

        this();
        this.marca = marca;
        this.modelo = modelo;
    }

    //getters and Setters
    public int getIdAutomovil() {
        return idAutomovil;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public void addRuedas(Rueda rueda){
        if (indiceRuedas < 5) {
            this.ruedas[indiceRuedas++] = rueda;
        }
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getRendimiento() {
        return rendimiento;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    //Setters
    public void setRendimiento(int rendimiento) {
        this.rendimiento = rendimiento;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public static int getContadorAutomoviles() {
        return contadorAutomoviles;
    }

    //metodos
    public String retornarDatos(){

        NumberFormat formatoColombiano = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));

        StringBuilder cadenaRuedas = new StringBuilder("\n\n Informacion Sobre las Ruedas \n");

        String texto = "RETORNANDO DATOS" + "\n\n"
                + "Id del automovil: " + idAutomovil + "\n"
                + "Marca: " + this.getMarca() + "\n"
                + "Conductor: " + this.conductor + "\n"
                + "Modelo: " + this.getModelo() + "\n"
                + "Precio: " + formatoColombiano.format(this.getPrecio()) +" COP" + "\n"
                + "Color: " + this.getColor() + "\n"
                + "Tipo de Auto: " + this.getTipo().getNombre() + "\n"
                + "Descripcion del Auto: " + this.getTipo().getDescripcion() + "\n"
                + "cantidad de puertas del Auto: " + this.getTipo().getCantidadPuertas() + "\n"
                + "Cilindraje: " + this.getMotor().getCilindraje() + " Litros" +"\n"
                + "Tipo de Motor: " + this.getMotor().getTipo() + "\n"
                + "Capacidad del tanque: " + this.getTanque().getCapacidad() + " Litros" + "\n"
                + "Ruedas:\n";

                    if (ruedas != null){

                        for(Rueda r : getRuedas()){
                            texto += r.getFabricante() + ", Aro: " + r.getAro() + "'' " + ", Ancho: " + r.getAncho() + " mm" + "\n";
                        }
                    }

                texto += "Velocidad: " + this.getVelocidad() + " Km/h" + "\n"
                + "Rendimiento: " + this.getRendimiento()+ " galon/En Ciudad" + "\n"
                + "Transmision: " + this.getTransmision() + "\n"
                + "Se ha(n) creado: " + contadorAutomoviles + " carro(s)";

        return texto;
    }

    public String movimientoCarrro(){

        Random  random = new Random();

        boolean estatusMOvimiento = random.nextBoolean();

        if (estatusMOvimiento){

            return "El automovil esta arrancando";
        }else {

            return "El automovil esta quieto";
        }
    }

    public float calcularConsumo(int km, float porcentajeBencina){

        return (float) km / tanque.getCapacidad() * porcentajeBencina;
    }

    @Override
    public boolean equals(Object obj) {

        Automovil a = (Automovil) obj;

        return (this.marca.equals(a.getMarca()) && this.velocidad == a.getVelocidad());
    }


    public static void evaluarVelocidadCarretera(int velocidad){

        if (velocidad <= 0){

            JOptionPane.showMessageDialog(null,
                    "El vehiculo esta quieto");

        }else if(velocidad < VELOCIDAD_MAX_CARRETERA){

            JOptionPane.showMessageDialog(null,
                    "Su velocidad es tolerable, recuerde la velocidad maxima en carretera es: " + VELOCIDAD_MAX_CARRETERA + " Km/h");

        } else if(velocidad == VELOCIDAD_MAX_CARRETERA){
            JOptionPane.showMessageDialog(null,
        "Cuidado, ha igualado la velocidad maxima en carretera, recuerde es de " + VELOCIDAD_MAX_CARRETERA + "Km/h",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

        } else if (velocidad > VELOCIDAD_MAX_CARRETERA) {
            JOptionPane.showMessageDialog(null,
        "CUIDADO, baje la velocidad ahora mismo, recuerde la velocidad maxima en carretera es de: " +
                VELOCIDAD_MAX_CARRETERA + "Km/h","PELIGRO",JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void evaluarVelocidadCiudad(int velocidad){


        if (velocidad <= 0){

            JOptionPane.showMessageDialog(null,
                    "El vehiculo esta quieto");

        }else if(velocidad < VELOCIDAD_MAX_CIUDAD){

            JOptionPane.showMessageDialog(null,
                    "Su velocidad es tolerable, recuerde la velocidad maxima en la ciudad es: " + VELOCIDAD_MAX_CIUDAD + " Km/h");

        } else if(velocidad == VELOCIDAD_MAX_CIUDAD){
            JOptionPane.showMessageDialog(null,
                    "Cuidado, ha igualado la velocidad maxima en la ciudad, recuerde es de " + VELOCIDAD_MAX_CIUDAD + "Km/h",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

        } else if (velocidad > VELOCIDAD_MAX_CIUDAD) {
            JOptionPane.showMessageDialog(null,
                    "CUIDADO, baje la velocidad ahora mismo, recuerde la velocidad maxima en la ciudad es de: " +
                            VELOCIDAD_MAX_CIUDAD + "Km/h","PELIGRO",JOptionPane.ERROR_MESSAGE);
        }
    }

    //El siguiente metodo de usa implementando la interfaz comparable
    //el metodo compareTo nos permite modificarlo para que compare con el atributo que queramos
    @Override
    public int compareTo(Object o) {

        Automovil a = (Automovil) o;
        return this.marca.compareTo(a.marca);
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "idAutomovil=" + idAutomovil +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                '}';
    }
}
