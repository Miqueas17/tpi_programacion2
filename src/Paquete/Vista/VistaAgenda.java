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
        System.out.println("===== AGENDA SEMANAL =====");

        for (int i = 0; i < agenda.length; i++) {
            for (int j = 0; j < agenda[i].length; j++) {
                Agenda a = agenda[i][j];

                if (a == null) {
                    System.out.print("null | ");
                } else {
                    System.out.print(a.getHora() + " (" + a.getEstado() + ") | ");
                }
            }
            System.out.println();
        }
    }
}

