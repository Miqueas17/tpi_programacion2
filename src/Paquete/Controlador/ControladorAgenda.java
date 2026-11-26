package Controlador;

import Modelo.Agenda;
import Vista.VistaAgenda;

public class ControladorAgenda {
     private static final int DIAS = 7;
    private static final int HORAS_POR_DIA = 9;
    private static final int DOMINGO = 6;
    private final VistaAgenda vista;
    private final Agenda[][] agenda = new Agenda[DIAS][HORAS_POR_DIA];

    public ControladorAgenda(VistaAgenda vista) {
        this.vista = vista;
    }

    public void crearNuevoObjeto() {
        for (int i = 0; i < DIAS; i++) {
            if (i == DOMINGO) {
                continue;
            }
            String fecha = vista.solicitarFechaAgenda();
            String dia = vista.solicitarDiaDeLaSemanaAgenda();

            for (int j = 0; j < HORAS_POR_DIA; j++) {
                String hora = vista.solicitarHoraAgenda();
                String estado = vista.solicitarEstadoAgenda();
                agenda[i][j] = new Agenda(fecha, dia, hora, estado);
            }
        }
    }

    public Agenda[][] getAgenda() {
        return agenda;
    }

    public void mostrarInformacion() {
        vista.mostrarAgenda(agenda);
    }
}

