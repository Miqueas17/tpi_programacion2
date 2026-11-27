package Vista;
import java.util.Scanner;
public class VistaProfesional {
    private Scanner scanner = new Scanner(System.in);
   public String solicitarNombreProfesional() {
     System.out.print("Nombre: ");
     return scanner.nextLine();
   }

   public String solicitarEspecialidadProfesional(){
    System.out.print("Especialidad: ");
    return scanner.nextLine();
   }

   public void mostrarInformacion(String[] d) {
    System.out.println("Profesionales: ");
     System.out.println(d[0] + " - " + d[1]);
   }
}

