import java.util.Scanner;

public class Ejercicio10 {

    // Dejamos el Scanner fuera para que sea fácil de gestionar
    Scanner Lector = new Scanner(System.in);

    public void Ejercicio10() {
        System.out.println("Ingrese el valor de la venta:");
        double venta = Double.parseDouble(Lector.nextLine());

        // 1. Calculamos el subtotal con el 19% de IVA de una vez (venta * 1.19)
        double totalConIva = venta * 1.19;

        // 2. Aplicamos el descuento directamente multiplicando por el remanente
        // Si descuentas el 25%, te queda el 75% (0.75)
        // Si descuentas el 10%, te queda el 90% (0.90)
        if (venta > 150000) {
            totalConIva *= 0.75;
        } else {
            totalConIva *= 0.90;
        }

        System.out.println("Total a pagar: " + totalConIva);
    }
}