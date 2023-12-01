package Vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Motocicleta extends Vehiculo {
    private int potencia;
    private String tipoDeMotor;
    private String suspension;

    public Motocicleta(String marca, String modelo, int anioDeFabricacion, double peso, double precio, int cantidadEnStock, int potencia, String tipoDeMotor, String suspension) {
        super(marca, modelo, anioDeFabricacion, peso, precio, cantidadEnStock);
        this.potencia = potencia;
        this.tipoDeMotor = tipoDeMotor;
        this.suspension = suspension;
    }

    // Getters
    public int getPotencia() {
        return this.potencia;
    }

    public String getTipoDeMotor() {
        return this.tipoDeMotor;
    }

    public String getSuspension() {
        return this.suspension;
    }

    // Setters
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setTipoDeMotor(String tipoDeMotor) {
        this.tipoDeMotor = tipoDeMotor;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    // Método para calcular la velocidad máxima
    @Override
    public double calcularVelocidadMaxima() {
        return ((this.potencia * 2) / this.getPeso()) * 20;
    }
}

