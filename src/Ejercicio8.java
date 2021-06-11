/**
 * Especificamos el paquete donde esta nuestro codigo fuente
 * E importamos todas las clases del paquete java util
 */
package src;
import java.util.*;
public class Ejercicio8 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de esta clase para evitar problemas con el ambito estatico
         */
        Ejercicio8 ejercicio8 = new Ejercicio8();
    }

    /**
     * Constructor de la clase donde se realizan las llamadas a los metodos 
     */
    public Ejercicio8(){
        /**
         * El usuario ingresa datos en los arreglos
         * Luego se envian al metodo comparacion de palabras y se evalua si hay palabras similares
         */
        System.out.println("Ingresa datos al primer arreglo");
        palabraIngresadaUno = ingresarPalabra();
        System.out.println("Ingresa datos al segundo arreglo");
        palabraIngresadaDos = ingresarPalabra();
        comparacionPalabras(palabraIngresadaUno, palabraIngresadaDos);
    }

    /**
     * Instanciamos objeto scanner para poder leer datos desde consola
     * Declaramos dos arreglos que solicitaron en el enunciado
     */
    Scanner scanner = new Scanner(System.in);
    String[] palabraIngresadaUno = new String[5];
    String[] palabraIngresadaDos = new String[5];

    /**
     * Metodo ingresarPalabra que retorna un arreglo de tipo string
     * @return
     */
    public String[] ingresarPalabra(){
        String[] palabra = new String[5];
        for(int i=0; i<5;  i++){
            System.out.println("Ingresa una palabra sin espacios");
            palabra[i] = scanner.nextLine();
        }

        return palabra;
    }

    /**
     * Metodo comparacion de palabras que pide dos arreglos como parametro y los compara para ver que elementos son iguales
     * @param arreglo1
     * @param arreglo2
     */
    public void comparacionPalabras(String[] arreglo1, String[] arreglo2){
        for(int i=0; i<5; i++){
            if(arreglo1[i].equals(arreglo2[i])){
                System.out.println("La palabra en la posicion "+(i+1)+" con tamaño "+arreglo1[i].length()+" es igual en ambos arreglos");
            }
        }
    }
}
