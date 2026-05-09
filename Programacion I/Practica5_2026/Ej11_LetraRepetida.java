package Practica5_2026;

/*
11. Dado un arreglo de caracteres, determinar si en el arreglo 
existe al menos una letra (verificar que es letra) repetida. 
a. En posiciones contiguas.  
b. En cualquier posición. 
*/

public class Ej11_LetraRepetida {
    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c', 'c', 'd', 'c', 'f', 'c' };
        boolean juntas = buscarRepetidasJuntas(arr);
        boolean repetidas = buscarRepetidas(arr);
        System.out.println("-- Resultado --");
        if (juntas) {
            System.out.println("En este arr hay letras repetidas contiguas.");
        }
        if (repetidas) {
            System.out.println("En este arr hay letras repetidas.");
        }
    }

    public static boolean buscarRepetidasJuntas(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (esLetra(arr[i]) && arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean buscarRepetidas(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (esLetra(arr[i])) {
                int letra = arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == letra) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean esLetra(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
