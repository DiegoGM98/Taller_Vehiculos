package controller;

import Vehiculos.TiendaDeVehiculos;
import Ventana.VentanaTiendaDeVehiculos;

// Clase TiendaDeVehiculosController
public class TiendaDeVehiculosController {
    public static void inicializar(){
        // Crear una nueva tienda de vehículos
        TiendaDeVehiculos tienda = new TiendaDeVehiculos();

        // Crear y mostrar la ventana de la tienda de vehículos
        VentanaTiendaDeVehiculos ventanaTienda = new VentanaTiendaDeVehiculos(tienda);
        ventanaTienda.setVisible(true);
    }

    public static void main(String[] args) {
        inicializar();
    }
}
