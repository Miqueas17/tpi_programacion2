
import Controlador.ControladorAgenda;
import Controlador.ControladorCliente;
import Controlador.ControladorProfesional;
import Vista.VistaAgenda;
import Vista.VistaCliente;
import Vista.VistaProfesional;


public class Main {
    public static void main(String[] args) {
    ControladorCliente ctrl = new ControladorCliente(new VistaCliente());
    ControladorProfesional ctrlp = new ControladorProfesional(new VistaProfesional());
    ctrl.crearNuevoObjeto();
    ctrl.mostrarInformacion();
    ctrlp.crearNuevoObjeto();
    ctrlp.mostrarInformacion();

    ControladorAgenda agenda = new ControladorAgenda(new VistaAgenda());

    agenda.crearNuevoObjeto();
    agenda.mostrarInformacion();


}
}
