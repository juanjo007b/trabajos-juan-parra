package servicios;
import java.util.Scanner;

public class Vacunacion {
    // Usamos un array para devolver dos datos: [Nombre, Precio]
    public String[] elegirVacuna(Scanner lector) {
        System.out.println("\n1.Moqui($65k) | 2.Cali($30k) | 3.Hepatitis($50k) | 4.Ninguno");
        System.out.print("Opción: ");
        String op = lector.nextLine();

        switch (op) {
            case "1": return new String[]{"Moquillo", "65000"};
            case "2": return new String[]{"Calicivirus", "30000"};
            case "3": return new String[]{"Hepatitis", "50000"};
            default:  return new String[]{"Ninguna", "0"};
        }
    }
}