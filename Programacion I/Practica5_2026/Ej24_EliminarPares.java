package Practica5_2026;

/*
24. Hacer un programa que elimine los valores pares en un arreglo. 
*/

public class Ej24_EliminarPares {
    public static void main(String[] args) {
        int[] arr = { 12, 2, 14, 4, 16, 6, 7, 8, 0 };
        eliminarPares(arr);
        System.out.println("-- Arreglo final sin pares --");
        mostrarArr(arr);
    }

    public static void eliminarPares(int[] arr) {
        int posPar = 0;
        posPar = buscarPosPar(arr, posPar);
        while (posPar != -1) {
            eliminarPar(arr, posPar);
            posPar = buscarPosPar(arr, posPar);
        }
    }

    public static int buscarPosPar(int[] arr, int pos) {
        for (int i = pos; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void eliminarPar(int[] arr, int pos) {
        for (int i = pos; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1]=-1;
    }

    public static void mostrarArr(int[] arr) {
        for (int n : arr) {
            System.out.print("[" + n + "]");
        }
        System.out.println();
    }
}
