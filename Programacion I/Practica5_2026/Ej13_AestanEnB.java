package Practica5_2026;

/*
13. Dado dos arreglos de números enteros A y B determinar si 
todos los números almacenados en el arreglo A están presentes 
en el arreglo B. 
*/

public class Ej13_AestanEnB {
    public static void main(String[] args) {
        int[] A = { 3, 8, 16 };
        int[] B = { 1, 3, 4, 8, 10, 11, 1 };

        if (buscarNums(A, B)) {
            System.out.println("Todos los nums de A estan presentes en B");
        } else {
            System.out.println("No todos los nums de A estan en B");
        }
    }

    public static boolean buscarNums(int[] A, int[] B) {
        for (int n : A) {
            if (!existeEnB(n, B)) {
                return false;
            }
        }
        return true;
    }

    public static boolean existeEnB(int numero, int[] B) {
        for (int n : B) {
            if (n == numero) {
                return true;
            }
        }
        return false;
    }
}
