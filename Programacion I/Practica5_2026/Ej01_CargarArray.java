package Practica5_2026;

/*1. Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado 
de valores entre 1 y 12. Luego mostrar cómo quedó cargado. */

public class Ej01_CargarArray {
    static final int TAM_ARR=15;
    public static void main(String[] args) {
        int arr[] = new int[TAM_ARR];
        cargarArr(arr);
        mostrar_arr(arr);
    }

    public static void cargarArr(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Introduce un numero entre 1 y 12");
            int numUsu = Utils.leerInt();
            while (numUsu < 1 || numUsu > 12) {
                System.out.println("Fuera de rango. Vuelva a ingresar un numero 1-12.");
                numUsu = Utils.leerInt();
            }
            arr[i]=numUsu;
        }
    }

    public static void mostrar_arr (int[]arr){
        System.out.println("Los numeros introducidos son: ");
        for(int num:arr){
            System.out.print("["+num+"]");
        }
    }
}
