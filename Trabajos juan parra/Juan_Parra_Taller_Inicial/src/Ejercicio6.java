import java.util.Scanner;

public class Ejercicio6 {

    public String telefono;

    Scanner Lector = new Scanner(System.in);

    public void Ejercicio6() {

        System.out.println("Ingrese su numero de telefono:");
        telefono = Lector.nextLine();

        if (telefono.startsWith("300")) {
            System.out.println("Operador: Claro");
        }
        else if (telefono.startsWith("301")) {
            System.out.println("Operador: Movistar");
        }
        else if (telefono.startsWith("302")) {
            System.out.println("Operador: Tigo");
        }
        else {
            System.out.println("Operador no identificado");
        }

    }
}