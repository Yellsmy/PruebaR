
package lista;

public class Nod {
    public String dato;
    public Nod siguiente; 
    
    public Nod(String dato){
        this.dato = dato;
    }
    
    public Nod(String dato, Nod siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
}
