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
    public void eliminarCliente(String nombre) {
        Cliente clienteAEliminar = null;
        for (Cliente cliente : this.clientes) {
            if (cliente.getNombre().equals(nombre)) {
                clienteAEliminar = cliente;
                break;
            }
        }
        if (clienteAEliminar != null) {
            this.clientes.remove(clienteAEliminar);
        }
    }

    // Método para buscar un cliente por su nombre
    public Cliente buscarCliente(String nombre) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getNombre().equals(nombre)) {
                return cliente;
            }
        }
        return null;
    }

    // Método para mostrar los clientes
    public String mostrarClientes() {
        StringBuilder clientesStr = new StringBuilder();
        if (clientes.isEmpty()) {
            clientesStr.append("No hay clientes registrados en la tienda.");
        } else {
            clientesStr.append("Clientes registrados en la tienda:\n");
            for (Cliente cliente : clientes) {
                clientesStr.append(cliente.getNombre()).append("\n");
            }
        }
        return clientesStr.toString();
    }

    // Método para realizar una venta
    public void realizarVenta(Venta venta) {
        for (Vehiculo vehiculo : venta.getListaDeVehiculos()) {
            vehiculo.setCantidadEnStock(vehiculo.getCantidadEnStock() - 1);
        }
    }
}




