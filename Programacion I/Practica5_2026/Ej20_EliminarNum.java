package Practica5_2026;

/*
20. Hacer un programa que dado un arreglo de enteros de tamaño 
10 que se encuentra precargado, solicite al usuario un número 
entero y elimine la primera ocurrencia del número (un número 
igual) en el arreglo (si existe). Para ello tendrá que buscar la 
posición y si está, realizar un corrimiento a izquierda (queda una 
copia de la última posición del arreglo en la anteúltima posición). 
*/

public class Ej20_EliminarNum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12 };
        System.out.println("Ingrese el numero a eliminar: ");
        int numUsu = Utils.leerInt();
        int pos = buscarPos(arr, numUsu);
        if (pos != -1) {
            eliminarNum(arr, pos);
            mostrarArr(arr);
        }else{
            System.out.println("ERROR! Su numero no se encontro en el arreglo.");
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
        arr[arr.length-1]=0;
    }

    public static void mostrarArr(int[] arr) {
        for (int n : arr) {
            System.out.print("[" + n + "]");
        }
        System.out.println();
    }
}
