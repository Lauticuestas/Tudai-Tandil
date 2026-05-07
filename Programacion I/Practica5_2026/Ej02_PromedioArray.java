package Practica5_2026;

/*2. Hacer un programa que dado un arreglo ya cargado con 10 
enteros, calcule el promedio real y lo muestre por la consola. */

public class Ej02_PromedioArray {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 7, 8, 1, 3, 10, 9, 12 };
        double promedio = calcular_prom(arr);
        System.out.println("El promedio real es: " + promedio);
    }

    public static double calcular_prom(int[] arr) {
        double sumaTotal = 0; // Double para que java pueda retornar double en "sumaTotal/arr.length"
        for (int i = 0; i < arr.length; i++) {
            sumaTotal += arr[i];
        }

        //Tambien puede usarse ForEach
        /*
            for(int n:arr){
                sumaTotal+=n;
            }
        */

        return sumaTotal / arr.length;
    }

}