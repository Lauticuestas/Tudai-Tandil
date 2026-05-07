package Practica5_2026;

/*
5.Hacer un programa que permita obtener el menor y el mayor 
elemento de un arreglo de enteros. 
*/

public class Ej05_MayorMenor {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 12, 1, 3, 23 };
        int numMenor = buscarMenor(arr);
        int numMayor = buscarMayor(arr);
        System.out.println("El menor numero del arreglo es: " + numMenor);
        System.out.println("El mayor numero del arreglo es: " + numMayor);
    }

    public static int buscarMenor(int[] arr) {
        int menor = arr[0];
        for (int n:arr) {
            if (n < menor) {
                menor = n;
            }
        }
        return menor;
    }

    public static int buscarMayor(int[] arr) {
        int mayor = arr[0];
        for (int n:arr) {
            if (n > mayor) {
                mayor = n;
            }
        }
        return mayor;
    }
}
