package Practica5_2026;

/*
18. Implementar un método que realice un corrimiento a izquierda 
en un arreglo ordenado de tamaño 10 a partir de una posición. 
*/

public class Ej18_CorrimientoIzquierda {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 8, 9, 10, 12, 14, 17 };
        int pos = 4;
        corrimientoIzq(arr, pos);
        System.out.println("-- El arreglo con corrimiento izquierda --");
        mostrarArr(arr);
    }

    public static void corrimientoIzq(int[] arr, int pos) {
        for (int i = pos; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public static void mostrarArr(int[] arr) {
        for (int n : arr) {
            System.out.print("[" + n + "]");
        }
        System.out.println();
    }
}
