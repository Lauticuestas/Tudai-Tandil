package Practica5_2026;

import java.util.Scanner;

// Clase de utilidades para lectura de datos por consola
public class Utils {
    private static Scanner scanner = new Scanner(System.in);

    public static String leerString() {
        return scanner.nextLine();
    }

    public static char leerChar() {
        String input = scanner.nextLine();
        return input.charAt(0);
    }

    public static int leerInt() {
        int valor = scanner.nextInt();
        scanner.nextLine(); // limpiar el buffer
        return valor;
    }

    public static double leerDouble() {
        double valor = scanner.nextDouble();
        scanner.nextLine(); // limpiar el buffer
        return valor;
    }
}
