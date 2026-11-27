package Controlador;

import java.util.ArrayList;

import Modelo.Cliente;

import Vista.VistaCliente;

public class ControladorCliente {
    private VistaCliente vista;
    private Cliente Modelo;
    private ArrayList<Cliente>listaClientes=new ArrayList<>();
    
    public void crearNuevoObjeto() {
        String n = vista.solicitarNombreCliente();
        String c = vista.solicitarApellidoCliente();
        String t = vista.solicitarTelefonoCliente();
        this.Modelo = new Cliente(n, c, t);
        listaClientes.add(this.Modelo);
    }

        public Cliente getModelo() {
        return Modelo;
    }

    public ControladorCliente(VistaCliente vista) {
    this.vista = vista;
}

public void mostrarInformacion() {
    String[] datos = {
        Modelo.getNombre(),
        Modelo.getApellido(),
        Modelo.getTelefono()
    };

    vista.mostrarInformacion(datos);
}
}
