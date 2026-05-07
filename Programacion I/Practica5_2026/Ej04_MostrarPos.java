package Practica5_2026;

/*
4. Buscar un elemento en un arreglo de caracteres ya cargado de 
tamaño 10 y mostrar la/s posición/es del elemento, en caso de no 
estar indicarlo también. 
*/

public class Ej04_MostrarPos {
    public static void main(String[] args) {
        char[] caracteres = { 'a', 'b', 'c', 'a', 'd', 'e', 'f', 'a', 'g', 'h' };
        char caracter = 'a';
        buscar_char(caracteres, caracter);
    }

    public static void buscar_char(char[] caracteres, char caracter) {
        boolean encontrado = false;
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == caracter) {
                System.out.println("Su caracter se encontro en la posicion: " + i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Su caracter no se encontro.");
        }
    }
}
