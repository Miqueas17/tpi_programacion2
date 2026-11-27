
import Controlador.ControladorAgenda;
import Controlador.ControladorCliente;
//import Controlador.ControladorCliente;
import Controlador.ControladorPlanilla;
import Controlador.ControladorProfesional;
//import Controlador.ControladorProfesional;
import Vista.VistaAgenda;
import Vista.VistaCliente;
//import Vista.VistaCliente;
import Vista.VistaPlanilla;
//import Vista.VistaProfesional;
import Vista.VistaProfesional;


public class Main {
    public static void main(String[] args) {
    ControladorAgenda controladorAgenda = new ControladorAgenda(new VistaAgenda());
    ControladorProfesional controladorProfesional = new ControladorProfesional(new VistaProfesional());
    ControladorCliente controladorCliente = new ControladorCliente(new VistaCliente());

    ControladorPlanilla controladorPlanilla = new ControladorPlanilla(
        new VistaPlanilla(), controladorAgenda, controladorProfesional, controladorCliente);

    controladorPlanilla.menuPrincipal();

    }
}
