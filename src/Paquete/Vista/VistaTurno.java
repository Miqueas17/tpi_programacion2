package Vista;

public class VistaTurno {

    public void mostrarInformacion(String[] d, int numero) {
        System.out.println("--- Turno " + numero + " ---");
        System.out.println("Fecha: " + d[0]);
        System.out.println("Hora: " + d[1]);
        System.out.println("Cliente: " + d[2]);
        System.out.println("Profesional: " + d[3]);
        System.out.println("Servicio: " + d[4]);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}