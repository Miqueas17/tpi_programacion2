package Controlador;

import java.util.ArrayList;

import Modelo.Servicio;
import Vista.VistaServicio;

public class ControladorServicio {
    private VistaServicio vista;
    private Servicio Modelo;
    private ArrayList <Servicio> listaServicio = new ArrayList<>();

    public void crearNuevoObjeto(){
        String n = vista.solicitarNombre();
        double p = vista.solicitarSolicitarPrecio();
        this.Modelo = new Servicio(n, p);
        listaServicio.add(this.Modelo);
    }

    public Servicio getModelo(){
        return Modelo;
    }
    
    public void mostrarInformacion() {
    String[] datos = {
        Modelo.getNombre(),
        "" + Modelo.getPrecioBase()
    };

    vista.mostrarInformacion(datos);
    }
}
