package Controlador;

import java.util.ArrayList;
import Modelo.Turno;
import Vista.VistaTurno;

public class ControladorTurno {
    private VistaTurno vista;
    private ArrayList<Turno> listaTurnos = new ArrayList<>();

    public ControladorTurno(VistaTurno vista) {
        this.vista = vista;
    }

    public void agregarTurno(Turno turno) {
        listaTurnos.add(turno);
    }

    public void mostrarTurnos() {
        if (listaTurnos.isEmpty()) {
            vista.mostrarMensaje("No hay turnos agendados");
            return;
        }

        for (int i = 0; i < listaTurnos.size(); i++) {
            Turno t = listaTurnos.get(i);

            String[] datos = {
                t.getFecha().getFechaDesde() + " al " + t.getFecha().getFechaHasta(),
                t.getHora().getHoraDesde() + " a " + t.getHora().getHoraHasta(),
                t.getCliente().getNombre(),
                t.getProfesional().getNombre(),
                t.getServicio().getNombre()
            };

            vista.mostrarInformacion(datos, i + 1);
        }
    }
}