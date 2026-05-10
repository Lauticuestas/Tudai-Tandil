package Practica5_2026;

/*
14. Dado dos arreglos de números enteros: un arreglo A de tamaño 
MAXA y un arreglo B de tamaño MAXB con números entre 0 y 
MAXA-1, determinar la suma de los elementos del arreglo A cuyas 
posiciones son indicadas por el arreglo B. Por ejemplo, dado 
A={3,6,31,9}, MAXA=4 y B={0,2} con MAXB=2 el sistema deberá 
informar: 34 (lo cual es el resultado de sumar el 3 de la posición 0 
y el 31 de la posición 2 del arreglo A). 
*/

public class Ej14_SumaSegunB {
    static final int maxA = 4;
    static final int maxB = 2;

    public static void main(String[] args) {
        int[] A = { 3, 6, 31, 9 };
        int[] B = { 0, 2 };
        int sumaTotal = sumar(A, B);
        System.out.println("-- Resultado --");
        System.out.println("La suma total, segun las pos de B, es: " + sumaTotal);
    }

    public static int sumar(int[] A, int[] B) {
        int suma = 0;
        for (int i = 0; i < maxB; i++) {
            int pos = B[i];
            suma += A[pos];
        }
        return suma;
    }
}
