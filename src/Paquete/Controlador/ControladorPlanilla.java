package Controlador;
import java.util.ArrayList;
import Modelo.Planilla;
import Modelo.Servicio;
import Modelo.Turno;
import Vista.VistaPlanilla;

public class ControladorPlanilla {
    private VistaPlanilla vista;
    private Planilla Modelo;
    private ControladorAgenda controladorAgenda;
    private ControladorProfesional controladorProfesional;
    private ControladorCliente controladorCliente;
    private ControladorServicio controladorServicio;
    private ControladorTurno controladorTurno;
    private ArrayList<Planilla> listaPlanillas = new ArrayList<>();

    public ControladorPlanilla(VistaPlanilla vista,
                               ControladorAgenda controladorAgenda,
                               ControladorProfesional controladorProfesional,
                               ControladorCliente controladorCliente,
                               ControladorServicio controladorServicio,
                               ControladorTurno controladorTurno) {
        this.vista = vista;
        this.controladorAgenda = controladorAgenda;
        this.controladorProfesional = controladorProfesional;
        this.controladorCliente = controladorCliente;
        this.controladorServicio = controladorServicio;
        this.controladorTurno = controladorTurno;
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

        Servicio servicio = controladorServicio.getModelo();
        Turno turno = new Turno(
                this.Modelo,
                controladorCliente.getModelo(),
                controladorProfesional.getModelo(),
                servicio,
                this.Modelo);
        controladorTurno.agregarTurno(turno);

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
        controladorCliente.crearNuevoObjeto();
        int opcion;
        do {
            vista.mostrarMenuCliente();
            opcion = vista.solicitarOpcion();

            switch (opcion) {
                case 1:
                    controladorAgenda.mostrarInformacion();
                    crearNuevoObjeto();
                    break;
                case 2:
                    controladorProfesional.mostrarInformacion();
                    break;
                case 3:
                    controladorAgenda.mostrarInformacion();
                    break;
                case 0:
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida");
            }
        } while (opcion != 0);
    }

    private void menuProfesional() {
        controladorProfesional.crearNuevoObjeto();
        int opcion;
        do {
            vista.mostrarMenuProfesional();
            opcion = vista.solicitarOpcion();

            switch (opcion) {
                case 1:
                    controladorAgenda.crearNuevoObjeto();
                    break;
                case 2:
                    controladorProfesional.crearNuevoObjeto();
                    break;
                case 3:
                    controladorTurno.mostrarTurnos();
                    break;
                case 0:
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida");
            }
        } while (opcion != 0);
    }
}