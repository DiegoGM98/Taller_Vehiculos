package Vehiculos;

public class Automovil extends Vehiculo {
    private int potencia;
    private int numeroDePuertas;
    private double tamanoDelMotor;

    public Automovil(String marca, String modelo, int anioDeFabricacion, double peso, double precio, int cantidadEnStock, int potencia, int numeroDePuertas, double tamanoDelMotor) {
        super(marca, modelo, anioDeFabricacion, peso, precio, cantidadEnStock);
        this.potencia = potencia;
        this.numeroDePuertas = numeroDePuertas;
        this.tamanoDelMotor = tamanoDelMotor;
    }

    // Getters
    public int getPotencia() {
        return this.potencia;
    }

    public int getNumeroDePuertas() {
        return this.numeroDePuertas;
    }

    public double getTamanoDelMotor() {
        return this.tamanoDelMotor;
    }

    // Setters
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public void setTamanoDelMotor(double tamanoDelMotor) {
        this.tamanoDelMotor = tamanoDelMotor;
    }

    // Método para calcular la velocidad máxima
    @Override
    public double calcularVelocidadMaxima() {
        return (this.potencia / this.getPeso()) * 10;
    }
}
