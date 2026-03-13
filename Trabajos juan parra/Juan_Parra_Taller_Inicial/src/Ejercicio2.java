import java.util.Scanner;

public class Ejercicio2 {

    public double num2;

    Scanner Lector = new Scanner (System.in);

    public void Ejercicio2() {

        Scanner Lector = new Scanner (System.in);

        System.out.println("Ingrese un numero decimal:");
        this.num2 = Double.parseDouble(Lector.nextLine());

        System.out.println("-- Numero decimal --" + "\n" +
                "- Su numero digitado es: " + this.num2 +"\n"

        );

        if (num2 < 0) {
            System.out.println("El número es negativo (menor que 0)");
        } else if (num2 > 0) {
            System.out.println("El número es positivo (mayor que 0)");
        } else {
            System.out.println("El número es cero.");
        }


    }
    public double getnum2() {return num2;}
}


