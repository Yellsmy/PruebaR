
package ejercicios;
//Ejercicio que los datos del arreglo 1 se copie en el arreglo 2
public class Ejercicio2 {
    
    public static void main(String[] args){
        int[] arreglo = new int[5];
        int[] arreglocopy = new int[5];
        
        arreglo[0] = 5;
        arreglo[1] = 10;
        arreglo[2] = 15;
        arreglo[3] = 20;
        arreglo[4] = 25;
        
        copy(arreglo,arreglocopy);
        
        System.out.println("Arreglo 1");
        for( int i=0;i<arreglo.length; i ++ ){
            System.out.println(arreglo[i]);
        }
        System.out.println("Arreglo 2");
        for( int i=0;i<arreglocopy.length; i ++ ){           
            System.out.println(arreglocopy[i]);
        }
        
    }
    public static int copy(int[] arreglo1, int[] arreglo2){
        for( int i=0; i<arreglo1.length; i ++ ){
            arreglo2[i] = arreglo1[i];   
        }
        return 0;
    }
    
    
    
}
