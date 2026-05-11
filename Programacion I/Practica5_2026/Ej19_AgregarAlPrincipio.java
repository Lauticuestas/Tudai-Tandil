package Practica5_2026;

/*
19. Hacer un programa que dado un arreglo de enteros de tamaño 
10 que se encuentra cargado, solicite al usuario un número entero 
y lo agregue al principio del arreglo (posición 0). Para ello tendrá 
que realizar un corrimiento a derecha (se pierde el último valor del 
arreglo) y colocar el número en el arreglo en la posición indicada. 
*/

public class Ej19_AgregarAlPrincipio {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Ingrese un numero para agregar.");
        int numUsu = Utils.leerInt();
        agregarNum(arr, numUsu);
        System.out.println("Arr con su numero agregado al principio: ");
        mostrarArr(arr);
    }

    public static void agregarNum(int[] arr, int numUsu) {
        corrimientoD(arr);
        arr[0] = numUsu;
    }

    public static void corrimientoD(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
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
