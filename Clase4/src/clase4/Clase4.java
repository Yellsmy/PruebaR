
package clase4;

public class Clase4 {
    /*
    //Recursividad
    public static void imprimir(int numero){
        if(numero <= 5){
            System.out.println(numero +" ");
            imprimir(numero +1);
        }
            
    }
    //Iteración
    public static void imprimirIterativo(int numero){
        for(int i=numero; i <= 5; i ++){
            System.out.println(numero + " ");
        }
    }*/
    
    public static void main(String[] args) {
        //imprimir(0);
        //imprimirIterativo(0);
        int[] array = new int[10];
        array.print();
        array.fill();
        array.prinln();
    }
    
}
