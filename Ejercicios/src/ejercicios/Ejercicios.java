/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

public class Ejercicios {
    private int Arreglo[]= new int[5];
    
    public Ejercicios(){
        this.Arreglo[0] = 3;
        this.Arreglo[1] = 1;
        this.Arreglo[2] = 7;
        this.Arreglo[3] = 2;
        this.Arreglo[4] = 5;
        
    }
    public int[] getArreglo(){
        return Arreglo;
    }
    public void setArreglo(int[] Arreglo){
        this.Arreglo = Arreglo;
    }
    
    public static int sumar(int[] Array){
        int total = 0;
        for(int i=0; i< 5; i++){
            total += this.Arreglo[i];           
        }
        return total;
    }
    public static void main(String[] args) {
        Ejercicios suma = new Ejercicios();
       
        System.out.println("La suma total es: "+ suma.sumar);
       
           
    }
    
}
