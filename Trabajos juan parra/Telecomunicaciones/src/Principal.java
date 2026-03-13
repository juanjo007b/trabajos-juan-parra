import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("--- CAJERO DE RECARGAS ---");

        while (continuar) {
            Usuario cliente = new Usuario();
            cliente.ingresarDatos();
            cliente.mostrarResumen();

            System.out.print("\n¿Desea otra recarga? (s/n): ");
            String respuesta = sn.next();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        System.out.println("Saliendo del sistema...");
    }
}