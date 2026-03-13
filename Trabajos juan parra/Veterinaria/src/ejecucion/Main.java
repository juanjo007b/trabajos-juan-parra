package ejecucion;

import animales.Mascotas;
import servicios.Vacunacion;
import facturacion.Factura;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // 1. Registro de Mascota (Usando el constructor nuevo)
        System.out.println("--- Registro ---");
        System.out.print("Nombre: ");  String n = lector.nextLine();
        System.out.print("Especie: "); String e = lector.nextLine();
        System.out.print("Peso: ");    double p = lector.nextDouble();
        lector.nextLine(); // Limpiar el buffer tras el double

        Mascotas m = new Mascotas(n, e, p);

        // 2. Proceso de Vacunación
        Vacunacion v = new Vacunacion();
        // Recibimos el array [NombreVacuna, Precio]
        String[] datosVacuna = v.elegirVacuna(lector);

        // 3. Generar Factura
        Factura f = new Factura();
        // Pasamos: Nombre Mascota, Nombre Vacuna (index 0) y Precio (index 1)
        f.generar(m.nombre, datosVacuna[0], datosVacuna[1]);

        System.out.println("\nProceso finalizado con éxito.");
        lector.close();
    }
}
