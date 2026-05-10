package Practica5_2026;

public class Ej15_VocalesYconsonantes {
    public static void main(String[] args) {
        char[]arr={'a','b','c','d','e'};
        char[] vocales=filtrarVocales(arr);
        char[] consonantes=filtrarCons(arr);
        System.out.println("-- Resultados --");
        mostrarArr(vocales);
        mostrarArr(consonantes);
    }
    public static char[] filtrarVocales(char[]arr){
        char[]vocales= new char[arr.length];
        int indiceV=0;
        for(char letra:arr){
            if(esVocal(letra)){
                vocales[indiceV]=letra;
                indiceV++;
            }
        }
        return vocales;
    }
    public static char[] filtrarCons(char[]arr){
        char[]cons= new char[arr.length];
        int indiceC=0;
        for(char letra:arr){
            if(!esVocal(letra)){
                cons[indiceC]=letra;
                indiceC++;
            }
        }
        return cons;
    }
    public static boolean esVocal(char letra){
        switch (letra) {
            case 'a':
                return true;
            case 'e':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
            default:
                return false;
        }
    }
    public static void mostrarArr(char[]arreglo){
        for(char letra:arreglo){
            System.out.print("["+letra+"]");
        }
        System.out.println();
    }
}
