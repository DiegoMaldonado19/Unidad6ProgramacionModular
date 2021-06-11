/**
 * Paquete src que es donde se encuentra nuestro codigo
 */
package src;
/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        /**
         * Instanciamos objeto de esta clase para poder evitar problemas de ambito estatico
         */
        Ejercicio4 ejercicio4 = new Ejercicio4();
    }

    /**
     * Instanciamos un objeto de la clase scanner para poder leer datos desde consola
     */
    Scanner scanner = new Scanner(System.in);

    /**
     * Declaramos un objeto de tipo entero para almacenar numeros aleatorios
     * Declaramos un entero para almacenar el numero mayor
     */
    int[] numeroAleatorio = new int[10];
    int numeroMayor=0;

    /**
     * Constructor de la clase donde llamamos los metodos declarados
     */
    public Ejercicio4(){
        /**
         * Ciclos de iteracion para poder llenar el arreglo, revisar el numero e imprimir la distancia con el numero mayor
         */
        for(int i=0; i<numeroAleatorio.length; i++){
            llenarArreglo(i);
        }
        for(int i=0; i<numeroAleatorio.length; i++){
            revisioNumeroMayor(i);
        }
        for(int i=0; i<numeroAleatorio.length; i++){
            mostrarDistacia(i);
        }
    }
    
    /**
     * Metodo para llenar el arreglo
     * @param posicion
     */
    public void llenarArreglo(int posicion){
        numeroAleatorio[posicion] = (int)(Math.random()*100);
    }

    /**
     * Metodo para revisar el arreglo y encontrar el numero mayor
     * @param posicion
     */
    public void revisioNumeroMayor(int posicion){
        if(numeroAleatorio[posicion]>numeroMayor){
            numeroMayor = numeroAleatorio[posicion];
        }
    }

    /**
     * Metodo final para mostrar la distancia entre el numero mayor y el numero iterado
     * @param posicion
     */
    public void mostrarDistacia(int posicion){
        System.out.println("La distancia entre "+numeroMayor+" y "+numeroAleatorio[posicion]+" es: "+(numeroMayor-numeroAleatorio[posicion]));
    }
}
