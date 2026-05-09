package Practica5_2026;

/*
9. Hacer un programa que dado un arreglo de enteros y un número 
N, genere un arreglo con las posiciones donde se encuentra dicho 
número. A continuación, multiplicar por un número M todas las 
ocurrencias del número N en el arreglo original.
*/

public class Ej09_PosYMult {
    static final int N = 10;
    static final int M = 3;

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 1, 3, 10, 8, 10 };
        buscarPos(arr);
        multiplicarN(arr);
    }

    public static void buscarPos(int[] arr) {
        int[] posiciones = new int[arr.length];
        int indicePos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == N) {
                posiciones[indicePos] = i;
                indicePos++;
            }
        }
        System.out.println("El numero " + N + " se encuentra en las posiciones: ");
        for (int j=0;j<indicePos;j++) {
            System.out.print("[" + posiciones[j] + "]");
        }
        System.out.println();
    }

    public static void multiplicarN(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == N) {
                arr[i] = arr[i] * M; 
            }
        }
        System.out.println("-- Arreglo Final --");
        for(int n:arr){
            System.out.print("["+n+"]");
        }
        System.out.println();
    }
}
