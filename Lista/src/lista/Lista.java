
package lista;
import java.util.Scanner;
public class Lista {
    Scanner op = new Scanner(System.in);
    List lista = new List();
    
    public void menu(){
        boolean salir = false;
        int opcion;
        
        while(!salir){
           System.out.println("1. Agregar"); 
           System.out.println("2. Mostrar");
           System.out.println("3. Buscar");
           System.out.println("4. Salir");
           System.out.println("Selecciona la opción");
           opcion = op.nextInt();
           switch(opcion){
            case 1:
                agregar();
                break;
            case 2:
                lista.imprimirNombres();
                break;
            case 3:
                buscarN();
                break;
            case 4:
                salir = true;               
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");          
            }
        }
    }
    
    public void agregar(){
        String nombre;
        System.out.println("Ingrese nombre: ");
        nombre = op.next();
        lista.agregar(nombre);
    }
    
    public void buscarN(){
        String busqueda;
        System.out.println("Ingrese nombre a buscar: ");
        busqueda = op.next();
        lista.buscar(busqueda);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Lista objeto = new Lista();
        objeto.menu();
    }
    
}
