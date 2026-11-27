package Vista;

import java.util.Scanner;

public class VistaServicio {
    private Scanner scanner = new Scanner(System.in);
   public String solicitarNombre() {
     System.out.print("Nombre: ");
     return scanner.nextLine();
   }

   public int solicitarSolicitarPrecio(){
    System.out.print("Precio: $");
    return scanner.nextInt();
   }

   public void mostrarInformacion(String[] d) {
     System.out.println(d[0] + " - " + d[1]);
   }
}
