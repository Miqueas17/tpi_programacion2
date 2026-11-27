package Controlador;

import java.util.ArrayList;

import Modelo.Planilla;
import Vista.VistaPlanilla;
import Vista.VistaProfesional;




public class ControladorPlanilla {
    private VistaPlanilla vista;
    private Planilla Modelo;
    private ControladorAgenda controladorAgenda;
    private ControladorProfesional controladorProfesional;
    private VistaProfesional vistaProfesional;
    private ControladorCliente controladorCliente;
    private ArrayList<Planilla> listaPlanillas = new ArrayList<>();

    public ControladorPlanilla(VistaPlanilla vista, ControladorAgenda controladorAgenda) {
        this.vista = vista;
        this.controladorAgenda = controladorAgenda;
    }

    public void crearNuevoObjeto() {
        String fd = vista.solicitarFechadesde();
        String fa = vista.solicitarFechaHasta();
        String hd = vista.solicitarHoraDesde();
        String ha = vista.solicitarHoraHasta();
        String d = vista.solicitarDuracion();

        String resultado = controladorAgenda.ocuparHorarios(fd, fa, hd, ha);

        if (resultado.equals(ControladorAgenda.DATO_INVALIDO)) {
            vista.mostrarMensaje(resultado);
            return;
        }

        this.Modelo = new Planilla(fd, fa, hd, ha, d);
        listaPlanillas.add(this.Modelo);
        vista.mostrarMensaje(resultado);
    }

    public Planilla getModelo() {
        return Modelo;
    }

    public void mostrarInformacion() {
        String[] datos = {
            Modelo.getFechaDesde(),
            Modelo.getFechaHasta(),
            Modelo.getHoraDesde(),
            Modelo.getHoraHasta(),
            Modelo.getDuracion()
        };
        vista.mostrarInformacion(datos);
    }

    public void menuPrincipal() {
    int opcion;
    do {
        vista.mostrarMenuPrincipal();
        opcion = vista.solicitarOpcion();

        switch (opcion) {
            case 1:
                menuCliente();
                break;
            case 2:
                menuProfesional();
                break;
            case 0:
                vista.mostrarMensaje("Saliendo del sistema...");
                break;
            default:
                vista.mostrarMensaje("Opcion no valida");
        }
    } while (opcion != 0);
    }
    
    private void menuCliente() {
    int opcion;
    do {
        controladorCliente.crearNuevoObjeto();
        vista.mostrarMenuCliente();
        opcion = vista.solicitarOpcion();

        switch (opcion) {
            case 1:
                controladorAgenda.mostrarInformacion();
                crearNuevoObjeto();
                break;
            case 2:
                vistaProfesional.mostrarInformacion(null);
                break;
            case 0:
                break;
            default:
                vista.mostrarMensaje("Opcion no valida");
        }
    } while (opcion != 0);
}

private void menuProfesional() {
    int opcion;
    do {
        controladorProfesional.crearNuevoObjeto();
        vista.mostrarMenuProfesional();
        opcion = vista.solicitarOpcion();

        switch (opcion) {
            case 1:
                controladorAgenda.crearNuevoObjeto(); 
                break;
            case 2:
                controladorProfesional.crearNuevoObjeto();
                break;
            case 0:
                break;
            default:
                vista.mostrarMensaje("Opcion no valida");
        }
    } while (opcion != 0);
}
}