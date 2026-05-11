package Practica5_2026;

public class Ej17_CorrimientoDerecha {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,8,9,10,12,14,17};
        int pos=7;
        corrimientoD(arr,pos);
        System.out.println("-- El arreglo con el corrimiento desde la pos: "+pos+" --");
        mostrarArr(arr);
    }
    public static void corrimientoD(int[] arr,int pos){
        for(int i=arr.length-1;i>pos;i--){
            arr[i]=arr[i-1];
        }
    }
    public static void mostrarArr(int[] arr){
        for(int n:arr){
            System.out.print("["+n+"]");
        }
        System.out.println();
    }
}
