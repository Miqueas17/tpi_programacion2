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

    // Devuelve la fila del día con esa fecha, o -1 si no existe
private int buscarDia(String fecha) {
    for (int i = 0; i < DIAS; i++) {
        if (agenda[i][0] != null && agenda[i][0].getFecha().equals(fecha)) {
            return i;
        }
    }
    return -1;
}

// Devuelve la columna del horario, o -1 si no existe
private int buscarHora(String hora) {
    for (int j = 0; j < HORAS_POR_DIA; j++) {
        if (agenda[0][j] != null && agenda[0][j].getHora().equals(hora)) {
            return j;
        }
    }
    return -1;
}

public static final String DATO_INVALIDO = "Dato ingresado no válido";

public String ocuparHorarios(String fechaDesde, String fechaHasta,
                             String horaDesde, String horaHasta) {
    int diaDesde = buscarDia(fechaDesde);
    int diaHasta = buscarDia(fechaHasta);
    int horaIni = buscarHora(horaDesde);
    int horaFin = buscarHora(horaHasta);

    // Alguno no existe en la agenda (mal escrito o fuera de rango)
    if (diaDesde == -1 || diaHasta == -1 || horaIni == -1 || horaFin == -1) {
        return DATO_INVALIDO;
    }

    // El "desde" es posterior al "hasta"
    if (diaDesde > diaHasta || horaIni > horaFin) {
        return DATO_INVALIDO;
    }

    int cambiados = 0;
    for (int i = diaDesde; i <= diaHasta; i++) {
        for (int j = horaIni; j <= horaFin; j++) {
            Agenda a = agenda[i][j];
            if (a != null && a.getEstado().equals("Libre")) {
                a.cambiarEstado();
                cambiados++;
            }
        }
    }
    return "Horarios ocupados: " + cambiados;
}
}

