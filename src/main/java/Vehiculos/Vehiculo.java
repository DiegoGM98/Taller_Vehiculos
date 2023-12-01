package Vehiculos;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int anioDeFabricacion;
    private double peso;
    private double precio;
    private int cantidadEnStock;

    public Vehiculo(String marca, String modelo, int anioDeFabricacion, double peso, double precio, int cantidadEnStock) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioDeFabricacion = anioDeFabricacion;
        this.peso = peso;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    // Getters
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAnioDeFabricacion() {
        return this.anioDeFabricacion;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getCantidadEnStock() {
        return this.cantidadEnStock;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnioDeFabricacion(int anioDeFabricacion) {
        this.anioDeFabricacion = anioDeFabricacion;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    // Método abstracto para calcular la velocidad máxima
    public abstract double calcularVelocidadMaxima();
}


