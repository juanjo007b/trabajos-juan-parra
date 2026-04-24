package util;

import java.util.Scanner;

public class InputUtil {

    private static Scanner sc = new Scanner(System.in);

    public static int leerInt() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            return -1;
        }
    }

    public static String leerTexto() {
        return sc.nextLine();
    }
}