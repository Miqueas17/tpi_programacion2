package Vista;

import java.util.Scanner;

import Modelo.Agenda;

public class VistaAgenda {
        private Scanner scanner = new Scanner(System.in);
   public String solicitarFechaAgenda() {
     System.out.print("Fecha: ");
     return scanner.nextLine();
   }

   public String solicitarDiaDeLaSemanaAgenda(){
    System.out.print("Dia de la semana: ");
    return scanner.nextLine();
   }

   public String solicitarHoraAgenda(){
    System.out.print("Horarios: ");
    return scanner.nextLine();
   }

    public String solicitarEstadoAgenda(){
    System.out.print("Estado: ");
    return scanner.nextLine();
   }

   public String solicitarHoraAgenda(int numero, int total) {
        System.out.print("Horario " + numero + " de " + total + ": ");
        return scanner.nextLine();
    }


    public void mostrarAgenda(Agenda[][] agenda) {
        System.out.println("\n===== AGENDA SEMANAL =====");
        for (int i = 0; i < agenda.length; i++) {
            String etiqueta = (agenda[i][0] != null)
                    ? agenda[i][0].getDiaDeLaSemana()
                    : "null";
            System.out.printf("%-12s|", etiqueta);

            for (int j = 0; j < agenda[i].length; j++) {
                Agenda a = agenda[i][j];
                String celda = (a == null)
                        ? "null"
                        : a.getHora() + " (" + a.getEstado() + ")";
                System.out.printf(" %-16s|", celda);
            }
            System.out.println();
        }
    }
}

