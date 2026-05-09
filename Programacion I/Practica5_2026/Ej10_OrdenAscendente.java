package Practica5_2026;

/*
10. Hacer un programa que determine si los valores almacenados 
en un arreglo de enteros se encuentran en orden ascendente. 
*/

public class Ej10_OrdenAscendente {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 6, 11, 13 };
        boolean ascendente = buscarAscendente(arr);
        System.out.println("-- Resultado --");
        if (ascendente) {
            System.out.println("Este arr tiene orden ascendente.");
        } else {
            System.out.println("No hay orden ascendente en este arr.");
        }
    }

    public static boolean buscarAscendente(int[] arr) {
        boolean ascendente = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1] || arr[i] == arr[i + 1]) {
                ascendente = true;
            } else {
                return false;
            }
        }
        return ascendente;
    }
}
