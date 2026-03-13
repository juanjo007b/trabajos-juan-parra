import java.util.Scanner;

public class Ejercicio9 {

    Scanner Lector = new Scanner(System.in);

    public void Ejercicio9() {
        System.out.println("Ingrese su edad:");
        int edad = Integer.parseInt(Lector.nextLine());

        // Usamos una estructura de cascada limpia
        if (edad < 0) {
            System.out.println("Edad no válida");
        } else if (edad <= 3) {
            System.out.println("Bebe");
        } else if (edad <= 12) { // Cubre de 4 a 12
            System.out.println("Niño");
        } else if (edad <= 17) { // Cubre de 13 a 17
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }
    }
}