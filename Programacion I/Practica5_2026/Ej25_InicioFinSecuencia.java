package Practica5_2026;

/*
25. Hacer un programa que devuelva la posición de inicio y fin de la 
primera secuencia de números distinta de ceros. 
*/

public class Ej_InicioFinSecuencia {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 1, 2, 3};
        int inicio = buscarInicio(arr);
        int fin = buscarFin(arr, inicio);
        System.out.println("Inicio: " + inicio + ". Fin: " + fin + ".");
    }

    public static int buscarInicio(int[] arr) {
        int inicio = 0;
        while (inicio < arr.length && arr[inicio] == 0) {
            inicio++;
        }
        return inicio;
    }

    public static int buscarFin(int[] arr, int inicio) {
        while (inicio < arr.length && arr[inicio] != 0) {
            inicio++;
        }
        return inicio - 1;
    }
}
