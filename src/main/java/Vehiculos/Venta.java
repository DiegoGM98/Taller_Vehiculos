package Vehiculos;

import java.util.Date;
import java.util.List;

// Clase Venta
public class Venta {
    private List<Vehiculo> listaDeVehiculos;
    private Cliente clienteAsociado;
    private Date fechaDeCompra;

    public Venta(List<Vehiculo> listaDeVehiculos, Cliente clienteAsociado, Date fechaDeCompra) {
        this.listaDeVehiculos = listaDeVehiculos;
        this.clienteAsociado = clienteAsociado;
        this.fechaDeCompra = fechaDeCompra;
    }

    // Getters
    public List<Vehiculo> getListaDeVehiculos() {
        return this.listaDeVehiculos;
    }

    public Cliente getClienteAsociado() {
        return this.clienteAsociado;
    }

    public Date getFechaDeCompra() {
        return this.fechaDeCompra;
    }

    // Setters
    public void setListaDeVehiculos(List<Vehiculo> listaDeVehiculos) {
        this.listaDeVehiculos = listaDeVehiculos;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public void setFechaDeCompra(Date fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }
}
