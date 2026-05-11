package Practica5_2026;

/*
27. Hacer un programa que devuelva la posición de inicio y fin de la 
anteúltima secuencia de números distintos de ceros. 
*/

public class Ej27_AnteultimaSecuencia {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 0, 0, 4, 5, 6, 0, 0, 0, 7, 8, 9 };
        int inicioAnt = -1, finAnt = -1, inicioUlt = -1, finUlt = -1, inicio = 0;
        inicio = buscarInicio(arr, inicio);
        while (inicio < arr.length) {
            int fin = buscarFin(arr, inicio);
            inicioUlt = inicio;
            finUlt = fin;
            inicio = buscarInicio(arr, fin + 1);
            if (inicio < arr.length) {
                inicioAnt = inicioUlt;
                finAnt = finUlt;
            }
        }
        if (inicioAnt > -1) {
            System.out.println("Inicio y fin de la anteultima secuencia: ");
            System.out.println("Inicio: " + inicioAnt);
            System.out.println("Fin: " + finAnt);
        } else {
            System.out.println("No hay secuencia anteultima.");
        }
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
