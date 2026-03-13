import java.util.Scanner;

public class Proceso {
    private final Scanner lector = new Scanner(System.in);

    public void iniciarOperaciones() {
        int op = -1;

        while (op != 0) {
            desplegarMenu();
            try {
                op = Integer.parseInt(lector.nextLine());

                if (op >= 1 && op <= 6) {
                    double a = solicitarValor("Ingrese valor A: ");
                    double b = solicitarValor("Ingrese valor B: ");
                    ejecutarAccion(op, a, b);
                } else if (op != 0) {
                    System.out.println("Opción inválida.");
                }
            } catch (Exception e) {
                System.out.println("Error: Ingrese solo números.");
                op = -1; // Reinicia para no salir del bucle
            }
        }
        System.out.println("Fin del programa.");
    }

    private void desplegarMenu() {
        // Uso de Text Block (Java 15+) para mayor claridad visual
        System.out.print("""
                
                --- CALCULADORA ---
                1. Sumar         2. Restar
                3. Multiplicar   4. Dividir
                5. Cociente Int. 6. Potencia
                0. Salir
                Elección:\s""");
    }

    private double solicitarValor(String mensaje) {
        System.out.print(mensaje);
        return Double.parseDouble(lector.nextLine());
    }

    private void ejecutarAccion(int opcion, double n1, double n2) {
        switch (opcion) {
            case 1 -> System.out.println("Resultado: " + (n1 + n2));
            case 2 -> System.out.println("Resultado: " + (n1 - n2));
            case 3 -> System.out.println("Resultado: " + (n1 * n2));
            case 4 -> {
                if (n2 != 0) System.out.println("Resultado: " + (n1 / n2));
                else System.out.println("Error: División por cero.");
            }
            case 5 -> {
                if (n2 != 0) System.out.println("Cociente: " + (int)(n1 / n2) + " Residuo: " + (n1 % n2));
                else System.out.println("Error: División por cero.");
            }
            case 6 -> System.out.println("Resultado: " + Math.pow(n1, n2));
        }
    }
}