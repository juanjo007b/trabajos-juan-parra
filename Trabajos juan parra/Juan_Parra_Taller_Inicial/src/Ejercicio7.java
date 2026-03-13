import java.util.Scanner;

public class Ejercicio7 {

    public int num1;
    public int num2;

    Scanner Lector = new Scanner(System.in);

    public void Ejercicio7() {

        System.out.println("Ingrese el primer numero:");
        num1 = Integer.parseInt(Lector.nextLine());

        System.out.println("Ingrese el segundo numero:");
        num2 = Integer.parseInt(Lector.nextLine());

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Valores intercambiados:");
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);

    }
}