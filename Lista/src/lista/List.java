
package lista;


public class List {
    protected Nod inicio, fin;
    public List(){
        this.inicio = null;
        this.fin = null;       
    }
    
    public void agregar(String dato){
        inicio = new Nod(dato, this.inicio);  //El puntero apuntara al nuevo elemento qu se agrega
        if(fin==null){
            fin = inicio;
        }       
    }
    
    public void imprimirNombres(){
        Nod temp = inicio;
        while(temp!= null){
            System.out.println("[" + temp.dato + "]");
            temp = temp.siguiente;
        }
    }
    
    public void buscar(String busqueda){
        Nod temp = inicio;
        while(temp!= null){
            if(temp.dato.equalsIgnoreCase(busqueda)){
                System.out.println("El nombre es: " + temp.dato);
            }
        } 
    }
    
}
