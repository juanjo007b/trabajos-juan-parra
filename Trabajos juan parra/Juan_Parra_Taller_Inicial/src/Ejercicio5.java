import java.util.Scanner;

public class Ejercicio5 {

    Scanner Lector = new Scanner(System.in);
    public int nacimiento;

    public void Ejercicio5() {
        System.out.println("Ingrese su año de nacimiento:");

        // Asignamos el valor directamente
        nacimiento = Integer.parseInt(Lector.nextLine());

        // Calculamos la edad restando el año de nacimiento al año actual
        int edad = 2026 - nacimiento;

        System.out.println("Su edad es: " + edad + " años.");
    }
}