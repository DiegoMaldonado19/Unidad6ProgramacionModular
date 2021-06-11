/**
 * Paquete src que es donde se encuentra el codigo fuente
 */
package src;
/**
 * Importamos paquete java util
 */
import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase para ahorrarnos problemas de ambitos estaticos
         */
        Ejercicio3 ejercicio3 = new Ejercicio3();
    }

    /**
     * Instanciamos un objeto de la clase scanner para poder leer datos desde consola
     */
    Scanner scanner = new Scanner(System.in);

    /**
     * Definimos arreglo para almacenar numeros ingresados por el usuario
     * Definimos numero para buscar el numero ingresado por el usuario
     */
    int[] numeroAleatorio = new int[8];
    int numeroABuscar=0;


    /**
     * Constructor donde llamamos a nuestros metodos
     */
    public Ejercicio3(){
        /**
         * Ciclo para llenar arreglos
         */
        for(int i=0; i<numeroAleatorio.length; i++){
            llenarArreglo(i);
        }
      
        /**
         * Booleana para saber si encontro el numero ingresado por el usuario
         */
        boolean encontrado = buscarNumeroEnArreglo();

        /**
         * Comparaciones para saber si encontramos el numero
         */
        if(encontrado==true){
            System.out.println("Encontramos el numero ");
        }
        else if(encontrado==false){
            System.out.println("No encontramos el numero");
        }
    }

    /**
     * Metodo para llenar el arreglo de numeros, enviandole un posicion iterada
     * @param posicion
     */
    public void llenarArreglo(int posicion){
        System.out.println("Ingrese un numero");
        numeroAleatorio[posicion] = scanner.nextInt();
    }

    /**
     * Metodo que retorna un booleano, para saber si encontramos el numero ingresado por el usuario
     * @return
     */
    public boolean buscarNumeroEnArreglo(){
        boolean encontrado = false;

        /**
         * El usuario ingresa el numero a buscar
         */
        System.out.println("Ingrese un numero para buscar");
        numeroABuscar = scanner.nextInt();
        /**
         * Ciclo para comparar todos los numeros del arreglo
         */
        for(int i=0; i<numeroAleatorio.length; i++){
            if(numeroAleatorio[i]==numeroABuscar){
                encontrado = true;
                return encontrado;
            }
        }
        return encontrado;
    }
}
