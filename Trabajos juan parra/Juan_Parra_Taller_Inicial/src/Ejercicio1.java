import java.util.Scanner;

public class Ejercicio1 {

    // Usamos el Scanner definido a nivel de clase
    Scanner Lector = new Scanner(System.in);
    public int num1;

    public void Ejercicio1() {
        System.out.println("Ingrese un numero entero:");

        // Simplificamos la lectura y asignación
        num1 = Integer.parseInt(Lector.nextLine());

        // Usamos una sola cadena de texto más limpia
        System.out.println("-- Numero --\n- Su numero digitado es: " + num1);
    }

    public int getnum1() { return num1; }
}