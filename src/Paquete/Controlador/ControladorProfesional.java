package Controlador;

import Modelo.Profesional;
import Vista.VistaProfesional;

public class ControladorProfesional {
    private VistaProfesional vista;
    private Profesional Modelo;
    
    public void crearNuevoObjeto() {
        String n = vista.solicitarNombreProfesional();
        String e = vista.solicitarEspecialidadProfesional();
        this.Modelo = new Profesional(n, e);
    }

        public Profesional getModelo() {
        return Modelo;
    }

    public ControladorProfesional(VistaProfesional vista) {
    this.vista = vista;
}

public void mostrarInformacion() {
    String[] datos = {
        Modelo.getNombre(),
        Modelo.getEspecialidad()
    };

    vista.mostrarInformacion(datos);
}
}
