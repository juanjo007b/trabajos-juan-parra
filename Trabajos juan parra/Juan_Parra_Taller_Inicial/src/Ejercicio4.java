import java.util.Scanner;

public class Ejercicio4 {

    public int num4;

    Scanner Lector = new Scanner(System.in);

    public void Ejercicio4() {

        System.out.println("Ingrese un numero entero:");
        this.num4 = Integer.parseInt(Lector.nextLine());

        System.out.println("Numero ingresado: " + num4);

        if (num4 % 2 == 0 && num4 > 0) {
            System.out.println("El numero es par positivo");
        }
        else if (num4 % 2 == 0 && num4 < 0) {
            System.out.println("El numero es par negativo");
        }
        else if (num4 % 2 != 0 && num4 > 0) {
            System.out.println("El numero es impar positivo");
        }
        else {
            System.out.println("El numero es impar negativo");
        }

    }
}