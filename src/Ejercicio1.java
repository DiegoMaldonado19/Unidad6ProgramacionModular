/**
 * Definimos el paquete donde esta nuestro codigo
 */
package src;
/**
 * Importamos el paquete java util
 */
import java.util.*;
public class Ejercicio1{
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase para evitar problemas de ambitos estaticos
         */
        Ejercicio1 ejercicio1 = new Ejercicio1();
    }

    /**
     * Instanciamos un objeto de clase scanner para poder leer datos desde consola
     */
    Scanner scanner = new Scanner(System.in);
    /**
     * Declaracion de arreglo para poder almacenar los numeros ingresados por el usuario
     */
    int[] numeroIngresado = new int[5];
    
    /**
     * Constructor que tiene un ambito secundario
     */
    public Ejercicio1(){
        /**
         * Iteraciones para poder leer y almacenar datos en los arreglos
         * Llamamos a los metodos correspondientes
         */
        for(int i=0; i<numeroIngresado.length; i++){
            ingresarDatos(i);
        }
        for(int i=0; i<numeroIngresado.length; i++){
            mostrarDatos(i);
        }

        /**
         * Calculamos el promedio llamando al metodo promedio
         */
        double promedio = promedio();
        System.out.println("El promedio de todos los numeros ingresados es: "+promedio);
    }

    /**
     * Metodo para ingresar datos en el arreglo
     * @param posicion
     */
    public void ingresarDatos(int posicion){
        System.out.println("Ingrese un numero");
        numeroIngresado[posicion] = scanner.nextInt();
    }

    /**
     * Metodo para mostrar datos del arreglo
     * @param posicion
     */
    public void mostrarDatos(int posicion){
        System.out.println("El numero con indice "+(posicion+1)+" tiene un valor de "+numeroIngresado[posicion]);
    }

    /**
     * Metodo para promediar las edades que ingresamos en el arreglo
     * @return
     */
    public double promedio(){
        int sumaTotal=0;
        for(int i=0; i<numeroIngresado.length; i++){
            sumaTotal += numeroIngresado[i];
        }
        double promedio = (double)sumaTotal/5;
        return promedio;
    }
}