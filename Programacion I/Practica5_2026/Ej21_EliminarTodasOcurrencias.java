package Practica5_2026;

/*
21. Hacer un programa que dado un arreglo de enteros de tamaño 
10 que se encuentra precargado, solicite al usuario un número 
entero y elimine todas las ocurrencia de número en el arreglo. 
Mientras exista (en cada iteración tiene que buscar la posición 
dentro del arreglo) tendrá que usar la posición para realizar un 
corrimiento a izquierda (quedarán tantas copias de la última 
posición del arreglo como cantidad de ocurrencias del número). 
*/

public class Ej21_EliminarTodasOcurrencias {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 4, 7, 4, 9, 10 };
        System.out.println("Ingrese un numero a eliminar en todo el arr:");
        int numUsu = Utils.leerInt();
        eliminarTodasOcurrencias(arr, numUsu);
        System.out.println("El arreglo sin ningun numero " + numUsu);
        mostrarArr(arr);
    }

    public static void eliminarTodasOcurrencias(int[] arr, int numUsu) {
        int pos = buscarPos(arr, numUsu);
        while (pos != -1) {
            eliminarNum(arr, pos);
            pos = buscarPos(arr, numUsu);
        }
    }

    public static int buscarPos(int[] arr, int numUsu) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numUsu) {
                return i;
            }
        }
        return -1;
    }

    public static void eliminarNum(int[] arr, int pos) {
        for (int i = pos; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void mostrarArr(int[] arr) {
        for (int n : arr) {
            System.out.print("[" + n + "]");
        }
        System.out.println();
    }
}
