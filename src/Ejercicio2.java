/**
 * Paquete src en el cual guardamos nuestro codigo fuente
 */
package src;
/**
 * Importamos paquete java util
 */
import java.util.*;
public class Ejercicio2 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de esta clase para ahorrarnos problemas de ambitos
         */
        Ejercicio2 ejercicio2 = new Ejercicio2();
    }

    /**
     * Declaramos un arreglo para almacenar los numeros aleatorios generados por el sistema
     */
    int[] numeroAleatorio = new int[10];
    /**
     * Variables para saber cual es el numero mayor y menor
     */
    int numeroMayor=0, numeroMenor=99; 

    /**
     * Constructor en el cual llamamos nuestros metodos
     */
    public Ejercicio2(){
        /**
         * Ciclos para poder llenar y mostrar los datos del arreglo entero
         */
        for(int i=0; i<numeroAleatorio.length; i++){
            llenarArreglo(i);
        }
        for(int i=0; i<numeroAleatorio.length; i++){
            mostrarArreglo(i);
        }
        /**
         * Ciclo para poder saber cual numero es menor y mayor
         */
        for(int i=0; i<numeroAleatorio.length; i++){
            revisioNumeroMayor(i);
        }
        System.out.println("El numero mayor es: "+numeroMayor);
        System.out.println("El numero menor es: "+numeroMenor);
    }

    /**
     * Metodo para llenar el arreglo de numeros aleatorios
     * @param posicion
     */
    public void llenarArreglo(int posicion){
        numeroAleatorio[posicion] = (int)(Math.random()*99);
    }

    /**
     * Metodo para mostrar los numeros del arreglo
     * @param posicion
     */
    public void mostrarArreglo(int posicion){
        System.out.println("El numero aleatorio es: "+numeroAleatorio[posicion]);
    }

    /**
     * Metodo para saber cual es el numero mayor y menor
     * @param posicion
     */
    public void revisioNumeroMayor(int posicion){
        for(int i=0; i<numeroAleatorio.length; i++){
            if(numeroAleatorio[posicion]>numeroMayor){
                numeroMayor = numeroAleatorio[posicion];
            }
            else if(numeroAleatorio[posicion]<numeroMenor){
                numeroMenor = numeroAleatorio[posicion];
            }
        }
    }
}
