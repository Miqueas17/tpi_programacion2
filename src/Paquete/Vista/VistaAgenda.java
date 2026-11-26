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

   public void mostrarInformacion(String[] d) {
     System.out.println(d[0] + " - " + d[1] + " - " + d[2] + " - " + d[3]);
   }

   public String solicitarHoraAgenda(int numero, int total) {
        System.out.print("Horario " + numero + " de " + total + ": ");
        return scanner.nextLine();
    }


    public void mostrarAgenda(Agenda[][] agenda) {
        System.out.println("\n===== AGENDA SEMANAL =====");
        for (int i = 0; i < agenda.length; i++) {
            // Etiqueta de la fila: el día si tiene datos, o "null" si está vacía
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

