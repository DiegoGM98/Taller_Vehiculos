package Ventana;

// Importaciones necesarias
import Vehiculos.*;

import javax.swing.*;
import java.awt.event.*;
import java.util.Date;

// Clase VentanaTiendaDeVehiculos
public class VentanaTiendaDeVehiculos extends JFrame {
    private JLabel textoMenu;
    private JButton botonAgregarCliente;
    private JButton botonMostrarClientes;
    private JButton botonEliminarCliente;
    private JButton botonAgregarVehiculo;
    private JButton botonRealizarVenta;
    private TiendaDeVehiculos tienda;

    public VentanaTiendaDeVehiculos(TiendaDeVehiculos tienda) {
        super("Gestión de la Tienda de Vehículos");
        this.tienda = tienda;
        setSize(500, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarMensajeMenu();
        generarBotonAgregarCliente();
        generarBotonMostrarClientes();
        generarBotonEliminarCliente();
        generarBotonAgregarVehiculo();
        generarBotonRealizarVenta();
    }

    private void generarMensajeMenu() {
        textoMenu = new JLabel("Gestión de la Tienda de Vehículos");
        textoMenu.setBounds(20, 30, 500, 30);
        add(textoMenu);
    }

    private void generarBotonAgregarCliente() {
        botonAgregarCliente = new JButton("Agregar Cliente");
        botonAgregarCliente.setBounds(175, 100, 150, 40);
        add(botonAgregarCliente);
        botonAgregarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes agregar el código para agregar un cliente
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
                String email = JOptionPane.showInputDialog("Ingrese el email del cliente:");
                String direccionDeEnvio = JOptionPane.showInputDialog("Ingrese la dirección de envío del cliente:");
                String informacionDePago = JOptionPane.showInputDialog("Ingrese la información de pago del cliente:");
                Cliente cliente = new Cliente(nombre, email, direccionDeEnvio, informacionDePago);
                tienda.agregarCliente(cliente);
            }
        });
    }

    private void generarBotonMostrarClientes() {
        botonMostrarClientes = new JButton("Mostrar Clientes");
        botonMostrarClientes.setBounds(175, 180, 150, 40);
        add(botonMostrarClientes);
        botonMostrarClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes agregar el código para mostrar los clientes
                tienda.mostrarClientes();
            }
        });
    }

    private void generarBotonEliminarCliente() {
        botonEliminarCliente = new JButton("Eliminar Cliente");
        botonEliminarCliente.setBounds(175, 260, 150, 40);
        add(botonEliminarCliente);
        botonEliminarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes agregar el código para eliminar un cliente
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente a eliminar:");
                tienda.eliminarCliente(nombre);
            }
        });
    }

    private void generarBotonAgregarVehiculo() {
        botonAgregarVehiculo = new JButton("Agregar Vehiculo");
        botonAgregarVehiculo.setBounds(175, 340, 150, 40);
        add(botonAgregarVehiculo);
        botonAgregarVehiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes agregar el código para agregar un vehículo
                String tipo = JOptionPane.showInputDialog("Ingrese el tipo de vehículo (Automovil o Motocicleta):");
                String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
                String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                int anioDeFabricacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fabricación del vehículo:"));
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del vehículo:"));
                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del vehículo:"));
                int cantidadEnStock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad en stock del vehículo:"));
                if (tipo.equalsIgnoreCase("Automovil")) {
                    int potencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la potencia del automóvil:"));
                    int numeroDePuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de puertas del automóvil:"));
                    double tamanoDelMotor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamaño del motor del automóvil:"));
                    Automovil automovil = new Automovil(marca, modelo, anioDeFabricacion, peso, precio, cantidadEnStock, potencia, numeroDePuertas, tamanoDelMotor);
                    tienda.agregarVehiculoAlCatalogo(automovil);
                } else if (tipo.equalsIgnoreCase("Motocicleta")) {
                    int potencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la potencia de la motocicleta:"));
                    String tipoDeMotor = JOptionPane.showInputDialog("Ingrese el tipo de motor de la motocicleta:");
                    String suspension = JOptionPane.showInputDialog("Ingrese la suspensión de la motocicleta:");
                    Motocicleta motocicleta = new Motocicleta(marca, modelo, anioDeFabricacion, peso, precio, cantidadEnStock, potencia, tipoDeMotor, suspension);
                    tienda.agregarVehiculoAlCatalogo(motocicleta);
                }
            }
        });
    }

    private void generarBotonRealizarVenta() {
        botonRealizarVenta = new JButton("Realizar Venta");
        botonRealizarVenta.setBounds(175, 420, 150, 40);
        add(botonRealizarVenta);
        botonRealizarVenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes agregar el código para realizar una venta
                String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente que realiza la compra:");
                Cliente cliente = tienda.buscarCliente(nombreCliente);
                if (cliente != null) {
                    Venta venta = new Venta(cliente.getCarritoDeCompras(), cliente, new Date());
                    tienda.realizarVenta(venta);
                } else {
                    System.out.println("El cliente no existe.");
                }
            }
        });
    }
}
