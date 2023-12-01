package Vehiculos;

import java.util.ArrayList;
import java.util.List;

public class TiendaDeVehiculos {
    private List<Vehiculo> catalogoDeVehiculos;
    private List<Cliente> clientes;

    public TiendaDeVehiculos() {
        this.catalogoDeVehiculos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    // Getters
    public List<Vehiculo> getCatalogoDeVehiculos() {
        return this.catalogoDeVehiculos;
    }

    public List<Cliente> getClientes() {
        return this.clientes;
    }

    // Setters
    public void setCatalogoDeVehiculos(List<Vehiculo> catalogoDeVehiculos) {
        this.catalogoDeVehiculos = catalogoDeVehiculos;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    // Método para agregar un vehículo al catálogo
    public void agregarVehiculoAlCatalogo(Vehiculo vehiculo) {
        this.catalogoDeVehiculos.add(vehiculo);
    }

    // Método para eliminar un vehículo del catálogo
    public void eliminarVehiculoDelCatalogo(Vehiculo vehiculo) {
        this.catalogoDeVehiculos.remove(vehiculo);
    }

    // Método para agregar un cliente
    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    // Método para eliminar un cliente
    public void eliminarCliente(Cliente cliente) {
        this.clientes.remove(cliente);
    }

    // Método para realizar una venta
    public void realizarVenta(Venta venta) {
        for (Vehiculo vehiculo : venta.getListaDeVehiculos()) {
            vehiculo.setCantidadEnStock(vehiculo.getCantidadEnStock() - 1);
        }
    }
}
