package Vista;

import java.util.Scanner;

public class VistaPlanilla {
    private Scanner scanner = new Scanner(System.in);

    public String solicitarFechadesde() {
        System.out.print("Fecha desde: ");
        return scanner.nextLine();
    }

    public String solicitarFechaHasta() {
        System.out.print("Fecha hasta: ");
        return scanner.nextLine();
    }

    public String solicitarHoraDesde() {
        System.out.print("Horarios desde: ");
        return scanner.nextLine();
    }

    public String solicitarHoraHasta() {
        System.out.print("Horarios hasta: ");
        return scanner.nextLine();
    }

    public String solicitarDuracion() {
        System.out.print("Duracion: ");
        return scanner.nextLine();
    }

    public void mostrarInformacion(String[] d) {
        System.out.println("Fecha: " + d[0] + " a " + d[1]);
        System.out.println("Horario: " + d[2] + " a " + d[3]);
        System.out.println("Duracion: " + d[4]);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarMenuPrincipal() {
        System.out.println("\n===== MENU PRINCIPAL =====");
        System.out.println("1. Cliente");
        System.out.println("2. Profesional");
        System.out.println("0. Salir");
    }

    public void mostrarMenuCliente() {
        System.out.println("\n===== MENU CLIENTE =====");
        System.out.println("1. Agregar turno");
        System.out.println("2. Ver profesionales");
        System.out.println("3. Ver agenda");
        System.out.println("0. Volver");
    }

    public void mostrarMenuProfesional() {
        System.out.println("\n===== MENU PROFESIONAL =====");
        System.out.println("1. Agregar agenda");
        System.out.println("2. Agregar profesionales");
        System.out.println("0. Volver");
    }

    public int solicitarOpcion() {
        System.out.print("Opcion: ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}