package Practica5_2026;

/*26. Hacer un programa que devuelva la posición de inicio y fin de la 
secuencia de números distintos de ceros cuya suma del contenido 
sea la mayor. */

public class Ej26_SecSumaMayor {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 3, 2, 0, 2, 2, 9, 0, 16, 3, 25 };
        int sumaMax = -1, inicioMax = -1, finMax = -1, inicio = 0; //-1 para comprobar despues a la hora de imprimir
        inicio = buscarInicio(arr, inicio);
        while (inicio < arr.length) {
            int fin = buscarFin(arr, inicio);
            int sumaSec = sumarSec(arr, inicio, fin);
            if (sumaSec > sumaMax) {
                sumaMax = sumaSec;
                inicioMax = inicio;
                finMax = fin;
            }
            inicio = buscarInicio(arr, fin + 1);
        }
        if (sumaMax > -1) {
            System.out.println("El inicio y fin de la secuencia suma mayor son: ");
            System.out.println("Inicio: " + inicioMax);
            System.out.println("Fin: " + finMax);
        } else {
            System.out.println("No se encontro ninguna secuencia.");
        }
    }

    public static int sumarSec(int[] arr, int inicio, int fin) {
        int suma = 0;
        while (inicio <= fin) {
            suma += arr[inicio];
            inicio++;
        }
        return suma;
    }

    public static int buscarInicio(int[] arr, int inicio) {
        while (inicio < arr.length && arr[inicio] == 0) {
            inicio++;
        }
        return inicio;
    }

    public static int buscarFin(int[] arr, int inicio) {
        while (inicio < arr.length && arr[inicio] != 0) {
            inicio++;
        }
        return inicio - 1;
    }
}
