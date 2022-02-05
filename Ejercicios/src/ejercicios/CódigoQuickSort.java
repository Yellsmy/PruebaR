
package ejercicios;

public class CódigoQuickSort {
    //Método Quicksort
    public static void quicksort(int A[], int izq, int der) {

        int pivote=A[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        int aux;
 
        while(i < j){                          // mientras no se crucen las búsquedas                                   
            while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
            while(A[j] > pivote) j--;           // busca elemento menor que pivote
            if (i < j) {                        // si no se han cruzado                      
                aux= A[i];                      // los intercambia
                A[i]=A[j];
                A[j]=aux;
            }
        }
   
        A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
   
        if(izq < j-1)
            quicksort(A,izq,j-1);          // ordenamos subarray izquierdo
        if(j+1 < der)
            quicksort(A,j+1,der);          // ordenamos subarray derecho
   
    }
    
    //Método Principal
    public static void main(String[] args) {
        int arreglo[] = new int[10];
        arreglo[0]= 1;
        arreglo[1]= 100;
        arreglo[2]= 33;
        arreglo[3]= 4;
        arreglo[4]= 29;
        arreglo[5]= 74;
        arreglo[6]= 12;
        arreglo[7]= 2;
        arreglo[8]= 51;
        arreglo[9]= 99;
        
        
        //Imprimir Método Quicksort
        System.out.println("_________Método Quicksort_________ ");       
        System.out.println("Array Original");
        quicksort(arreglo,0,arreglo.length-1);
        System.out.println("Array ordenado");
        for(int i=0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
            
        }
    }
}


    /*private int arreglo[];
    
    public Ordenamiento(){
        this.arreglo = new int[9];
        this.arreglo[0]= 2;
        this.arreglo[1]= 50;
        this.arreglo[2]= 23;
        this.arreglo[3]= 100;
        this.arreglo[4]= 1;
        this.arreglo[5]= 67;
        this.arreglo[6]= 14;
        this.arreglo[7]= 99;
        this.arreglo[8]= 41;
        this.arreglo[9]= 10;
        
    }
    
    public int[] getOrdenamiento(){
        return arreglo;
    }
    
    public void setOrdenamiento(){
        this.arreglo = arreglo;
    }
    
    private  void Burbuja(int[] lista){
        for (int i = 0; i < arreglo.length; i++) {
        // Aquí "y" se detiene antes de llegar
        // a length - 1 porque dentro del for, accedemos
        // al siguiente elemento con el índice actual + 1
        for (int j = 0; j < arreglo.length - 1; j++) {
            int Actual = arreglo[j];
            int Siguiente = arreglo[j + 1];
            if (Actual > Siguiente) {
                // Intercambiar
                arreglo[j] = Siguiente;
                arreglo[j + 1] = Actual;
                }
    
           
 }
    public void main(String[] args) {
        // TODO code application logic here
        Ordenamiento Correr = new Ordenamiento();
        Correr.Burbuja(this.arreglo);
    }

    Ordenamiento Objeto = new Ordenamiento();
    Obejto.
    System.out.println("Arreglo 1");
        for( int i=0;i<=Lista.length; i ++ ){
            System.out.println(Lista[i]+"----");
        }
    }
   
    //Método burbuja
    public void Burbuja(int[]Lista){
        int aux;
        for (int i = 0; i <Lista.length; i++)
            for (int j=0; j <Lista.length; j++)
                if(Lista[j] > Lista[j+1]){
                    aux = Lista[j];
                    Lista[j]= Lista[j+1];
                    Lista[j+1] = aux;                   
                }
        
    }
    
    //Método Quicksort
    //public void Quicksort(){
        
    //}   
}
  // Empecemos con un array cualesquiera al que llamamos "CoduJ"
		/*int coduj[] = { 2, 3, 4, 1, 8, 9, 4 };
		System.out.println("Array al principio: " + Arrays.toString(coduj));
		// Extraccion y simplificacion de codigo repetitivo y largo
		int len = coduj.length - 1;
		// Correcciones pertinentes
		for (int j = 0; j < len; j++) {
			for (int i = 0; i < len; i++) {
				if (coduj[i] > coduj[i + 1]) {
					int aux = coduj[i];
					coduj[i] = coduj[i + 1];
					coduj[i + 1] = aux;
				}
			}*/
