package Vehiculos;

import java.util.*;

// Clase Cliente
public class Cliente {
    private String nombre;
    private String email;
    private String direccionDeEnvio;
    private String informacionDePago;
    private List<Vehiculo> carritoDeCompras;

    public Cliente(String nombre, String email, String direccionDeEnvio, String informacionDePago) {
        this.nombre = nombre;
        this.email = email;
        this.direccionDeEnvio = direccionDeEnvio;
        this.informacionDePago = informacionDePago;
        this.carritoDeCompras = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public String getDireccionDeEnvio() {
        return this.direccionDeEnvio;
    }

    public String getInformacionDePago() {
        return this.informacionDePago;
    }

    public List<Vehiculo> getCarritoDeCompras() {
        return this.carritoDeCompras;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccionDeEnvio(String direccionDeEnvio) {
        this.direccionDeEnvio = direccionDeEnvio;
    }

    public void setInformacionDePago(String informacionDePago) {
        this.informacionDePago = informacionDePago;
    }

    public void setCarritoDeCompras(List<Vehiculo> carritoDeCompras) {
        this.carritoDeCompras = carritoDeCompras;
    }

    // Método para agregar un vehículo al carrito de compras
    public void agregarVehiculoAlCarrito(Vehiculo vehiculo) {
        this.carritoDeCompras.add(vehiculo);
    }

    // Método para eliminar un vehículo del carrito de compras
    public void eliminarVehiculoDelCarrito(Vehiculo vehiculo) {
        this.carritoDeCompras.remove(vehiculo);
    }
}
