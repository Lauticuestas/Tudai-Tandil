package Practica5_2026;

public class Ej08_CantPares {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 7, 11, 3, 1, 8, 13, 0 };
        int cantPares = buscarPares(arr);
        System.out.println("La cantidad de pares es: " + cantPares);
    }

    public static int buscarPares(int[] arr) {
        int contador = 0;
        for (int n : arr) {
            if (n % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

}
