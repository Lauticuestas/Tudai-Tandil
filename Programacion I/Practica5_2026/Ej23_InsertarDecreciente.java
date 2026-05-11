package Practica5_2026;

/*
23. Hacer un programa que inserte un elemento en un arreglo 
(ordenado decrecientemente).
 */

public class Ej23_InsertarDecreciente {
    public static void main(String[] args) {
        int[] arr = { 10, 8, 6, 4, 2 };
        int numAg = 1;
        int pos = buscarPos(arr, numAg);
        agregarNum(arr, numAg, pos);
        System.out.println("-- Arreglo final --");
        mostrarArr(arr);
    }

    public static int buscarPos(int[] arr, int numAg) {
        for (int i = 0; i < arr.length; i++) {
            if (numAg > arr[i]) {
                return i;
            }
        }
        return arr.length - 1;
    }

    public static void agregarNum(int[] arr, int numAg, int pos) {
        corrimientoD(arr, pos);
        arr[pos] = numAg;
    }

    public static void corrimientoD(int[] arr, int pos) {
        for (int i = arr.length - 1; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
    }

    public static void mostrarArr(int[] arr) {
        for (int n : arr) {
            System.out.print("[" + n + "]");
        }
        System.out.println();
    }
}
