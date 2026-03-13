import java.util.Scanner;

public class Usuario {
    public String nombre, operador;
    public long telefono;
    public double monto;
    private int idTransaccion;

    public Usuario() {
        // Genera un ID simple entre 1000 y 9999
        this.idTransaccion = (int)(Math.random() * 9000) + 1000;
    }

    public void ingresarDatos() {
        Scanner lector = new Scanner(System.in);

        System.out.print("Nombre: ");
        this.nombre = lector.nextLine();

        System.out.print("Operador: ");
        this.operador = lector.next(); // next() lee solo una palabra

        System.out.print("Teléfono: ");
        this.telefono = lector.nextLong();

        System.out.print("Monto: $");
        this.monto = lector.nextDouble();
    }

    public void mostrarResumen() {
        System.out.println("\n>>> RECARGA #" + idTransaccion + " EXITOSA");
        System.out.println(operador + " | " + telefono + " | $" + monto);
        System.out.println("Cliente: " + nombre);
    }
}