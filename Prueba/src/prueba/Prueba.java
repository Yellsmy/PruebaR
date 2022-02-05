
package prueba;


public class Prueba {

    
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        int numero = 5;
        String nombre = "Lily";
        char letra = 'T';
        double temperatura = 20.3;
        boolean verdadero = false;
        long saldo = 2000;
        
        int num1, num2, resultado;
        num1 = 5;
        num2 = 1;
        resultado = num1 + num2;
        
        System.out.println("El resultado de la suma es de : " + resultado);
        
        
        if (num1 > num2){
            System.out.println("El numero 1 es mayor que numero 2");
           
        }
        else {
            if (num1 == num2){
                System.out.println("Los números son iguales");
            }
            else {
                System.out.println("El numero 2 es mayor al numero 1");
                
            }
            
        }
        int cont = 0;
        while (cont >= 0){
            System.out.println("Estoy en la vuelta"+ cont);
            cont = cont + 1;
        }
                
    }
    
}
