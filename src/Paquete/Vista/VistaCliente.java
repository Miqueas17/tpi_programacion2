package Vista;

import java.util.Scanner;

public class VistaCliente {
    private Scanner scanner = new Scanner(System.in);
   public String solicitarNombreCliente() {
     System.out.print("Nombre: ");
     return scanner.nextLine();
   }

   public String solicitarApellidoCliente(){
    System.out.print("Apellido: ");
    return scanner.nextLine();
   }

   public String solicitarTelefonoCliente(){
    System.out.print("Telefono: ");
    return scanner.nextLine();
   }

   public void mostrarInformacion(String[] d) {
     System.out.println(d[0] + " - " + d[1] + " - " + d[2]);
   }
}
