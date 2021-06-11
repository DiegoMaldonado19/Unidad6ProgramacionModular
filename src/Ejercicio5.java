/**
 * Paquete de donde se encuentran nuestros codigos fuente
 * E importacion del paquete java util
 */
package src;
import java.util.*;
public class Ejercicio5{
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de esta clase para evitar problemas de ambito estatico
         */
        Ejercicio5 ejercicio5 = new Ejercicio5();
    }

    /**
     * Constructor de la clase, donde se desarrolla la logica del programa
     */
    public Ejercicio5(){
        /**
         * Generamos un numero aleatorio para saber cuantas notas se ingresaran al arreglo y se imprime en pantalla
         */
        numeroDeNotas = (int)(Math.random()*100+1);
        System.out.println("El numero de notas a generar es de: "+numeroDeNotas);
        /**
         * Llamamos al metodo que inicializa el arreglo
         */
        inicializarArregloNotas(numeroDeNotas);

        /**
         * Imprimimos las notas generadas con la ayuda un metodo iterado
         */
        for(int i=0; i<numeroDeNotas; i++){
            mostrarNotas(i);
        }

        /**
         * Posteriormente hallamos la media de la muestra
         */
        hallarMedia();
    }

    /**
     * Arreglo para almacenar notas generadas al azar y variables enteras para poder desarrollar la logica del sistema
     */
    int[] notaIngresada = new int[100];
    int numeroDeNotas=0, notaMedia=0, ultimaPosicion=0, sumatoriaNotas=0;

    /**
     * Metodo inicializar arreglo de notas, el cual nos permite llenar de notas aleatorias el arreglo
     * @param numeroNotas
     */
    public void inicializarArregloNotas(int numeroNotas){
        for(int i=0; i<(numeroNotas-1); i++){
            notaIngresada[i] = (int)(Math.random()*10);
        }
        notaIngresada[numeroNotas-1] = -50;
    }
    
    /**
     * Metodo mostrar notas, el cual recorre nuestro arreglo e imprime en consola las notas generadas
     * @param posicion
     */
    public void mostrarNotas(int posicion){
        System.out.println("La nota "+(posicion+1)+" es de: "+notaIngresada[posicion]);
    }

    /**
     * Metodo hallar media, el cual permite hallar la media de las notas generadas, finalmente imprime el resultado
     */
    public void hallarMedia(){
        for(int i=0; i<(numeroDeNotas-1); i++){
            sumatoriaNotas += notaIngresada[i];
        }
        notaMedia = sumatoriaNotas/(numeroDeNotas-1);
        System.out.println("La nota media para las notas ingresadas es de: "+notaMedia);
    }
}
