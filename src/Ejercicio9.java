/**
 * Definimos a en que paquete se encuentra nuestro codigo fuente
 */
package src;
import java.util.*;
public class Ejercicio9 {
    public static void main(String[] args){
        /**
         * Instanciamos un objero de la clase para evitar problemas con el ambito estatico
         */
        Ejercicio9 ejercicio9 = new Ejercicio9();
    }

    /**
     * Constructor donde llamaremos a nuestros metodos y haremos toda la logica
     */
    public Ejercicio9(){

        /**
         * Se le piden los tamaños de las matrices al usuario
         */
        System.out.println("Ingresa el tamaño de la primera matriz");
        tamanioX1 = scanner.nextInt();
        tamanioY1 = scanner.nextInt();
        System.out.println("Ingresa el tamaño de la primera matriz");
        tamanioX2 = scanner.nextInt();
        tamanioY2= scanner.nextInt();

        /**
         * Se definen localmente las matrices 
         */
        int[][] matrizUno = new int[tamanioX1][tamanioY1];
        int[][] matrizDos = new int[tamanioX2][tamanioY2];

        /**
         * Se llena de numeros aleatorios
         */
        matrizUno = llenarMatriz(tamanioX1, tamanioY1);
        matrizDos = llenarMatriz(tamanioX2, tamanioY2);

        /**
         * Se muestran en consola
         */
        System.out.println("Matriz 1:");
        mostrarMatriz(matrizUno, tamanioX1, tamanioY1);
        System.out.println("-----------------------------");
        System.out.println("Matriz 2:");
        mostrarMatriz(matrizDos, tamanioX1, tamanioY1);

        /**
         * Comparacion para saber si son del mismo tamaño
         */
        if(tamanioX1==tamanioX2 && tamanioY1==tamanioY2){
            /**
             * Si son del mismo tamaño se llama al metodo sumar matrices y se imprime en pantalla la matriz resultante
             */
            tamanioX = tamanioX1;
            tamanioY = tamanioY1;
            int[][] matrizResultante = new int[tamanioX][tamanioY];

            matrizResultante = sumarMatrices(matrizUno, matrizDos);
            System.out.println("---------------------------");
            System.out.println("Matriz resultante:");
            mostrarMatriz(matrizResultante, tamanioX, tamanioY);
        }
        else{
            System.out.println("Solo se pueden sumar matrices con la misma dimension");
        }
    }

    /**
     * Instanciamos objeto scanner para leer desde consola
     * Y definimos variables enteras para los tamaños
     */
    Scanner scanner = new Scanner(System.in);
    int tamanioX1=0, tamanioY1=0, tamanioX2=0, tamanioY2=0, tamanioX=0, tamanioY=0;

    /**
     * Metodo llenar matriz, que llena de numeros aleatorios la matriz
     * @param x
     * @param y
     * @return
     */
    public int[][] llenarMatriz(int x, int y){
        int[][] matriz = new int[x][y];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                matriz[i][j] = (int)(Math.random()*555);
            }
        }
        return matriz;
    }

    /**
     * Metodo suma de matrices que suma las matrices que se ingresen en el y retorna la matriz resultante
     * @param matriz1
     * @param matriz2
     * @return
     */
    public int[][] sumarMatrices(int[][] matriz1, int[][] matriz2){

        int[][] matrizResultante = new int[tamanioX][tamanioY];

        for(int i=0; i<tamanioX; i++){
            for(int j=0; j<tamanioY; j++){
                matrizResultante[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matrizResultante;
    }

    /**
     * Metodo motrar matriz, para imprimir matrices en pantalla
     * @param matriz
     * @param x
     * @param y
     */
    public void mostrarMatriz(int[][] matriz, int x, int y){
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                if(j==(y-1)){
                    System.out.println(matriz[i][j]);
                }
                else{
                    System.out.print(matriz[i][j]+" | ");
                }
            }
        }
    }

}
