package animales;
import java.util.Scanner;

public class Mascotas {
    public String nombre, especie, raza;
    public double peso; // Cambiado a número para ser funcional

    public Mascotas(String n, String e, double p) {
    }

    public void preguntardatos(Scanner lector) {
        System.out.println("\n--- Registro de Mascota ---");
        System.out.print("Nombre: "); this.nombre = lector.nextLine();
        System.out.print("Especie: "); this.especie = lector.nextLine();
        System.out.print("Raza: "); this.raza = lector.nextLine();
        System.out.print("Peso (kg): "); this.peso = lector.nextDouble();
        lector.nextLine(); // Limpiar el buffer
    }

    public void mostrarDatos() {
        System.out.println("\n[ Ficha: " + nombre + " | " + especie + " | " + raza + " | " + peso + "kg ]");
    }
}