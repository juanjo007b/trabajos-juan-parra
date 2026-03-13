import java.util.Random;

public class Ejercicio8 {

    public void Ejercicio8() {
        Random random = new Random();

        // Fórmula: random.nextInt(max - min + 1) + min
        // Para 50 a 70: (70 - 50 + 1) = 21
        int numero = random.nextInt(21) + 50;

        System.out.println("Número aleatorio entre 50 y 70: " + numero);
    }
}