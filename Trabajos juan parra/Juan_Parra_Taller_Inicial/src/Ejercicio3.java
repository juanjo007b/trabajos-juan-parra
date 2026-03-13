import java.util.Scanner;

public class Ejercicio3 {

    // Scanner único a nivel de clase
    Scanner Lector = new Scanner(System.in);
    public int num3;

    public void Ejercicio3() {
        System.out.println("Ingrese un numero entero:");

        // Leemos directamente a la variable
        num3 = Integer.parseInt(Lector.nextLine());

        System.out.println("-- Resultado --");

        // Determinamos si es par o impar usando el operador residuo (%)
        if (num3 % 2 == 0) {
            System.out.println("El número " + num3 + " es par.");
        } else {
            System.out.println("El número " + num3 + " es impar.");
        }
    }

    public int get() { return num3; }
}
