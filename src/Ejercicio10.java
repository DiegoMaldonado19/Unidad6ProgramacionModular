/**
 * Definimos el paquete donde se encuentra nuestro codigo fuente
 */
package src;
public class Ejercicio10{
        public static void main(String[] args){
        /**
         * Instanciamos un objeto de esta clase para evitar problemas con el ambito estatico
         */
        Ejercicio10 ejercicio10 = new Ejercicio10();
    }

    /**
     * Constructor de la clase donde se realizan las llamadas correspondientes a los metodos
     */
    public Ejercicio10(){

        /**
         * Llenamos matriz original y la imprimimos en pantalla
         */
        matrizOriginal = llenarMatriz(3, 4);
        System.out.println("Matriz original:");
        mostrarMatriz(matrizOriginal, 3, 4);
        System.out.println("\n");
        /**
         * Obtenemos la matriz transpuesta mediante su metodo y la imprimimos en pantalla
         */
        matrizTranspuesta = matrizTranspuesta(4,3);
        System.out.println("Matriz transpuesta:");
        mostrarMatriz(matrizTranspuesta, 4, 3);

    }

    /**
     * Definicion de matrices para poder realizar elprograma
     */
    int[][] matrizOriginal = new int[3][4];
    int[][] matrizTranspuesta = new int[4][3];

    /**
     * Metodo para llenar matrices, recibe los parametros del numero de filas y columnas
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
     * Metodo para obtener la matriz transpuesta enviando sus filas y columnas
     * @param x
     * @param y
     * @return
     */
    public int[][] matrizTranspuesta(int x, int y){
    
        int[][] matrizAuxiliar = new int[4][3];  

        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                matrizAuxiliar[i][j] = matrizOriginal[j][i];
            }
        }

        return matrizAuxiliar;
    }

    /**
     * Metodo para imprimir pantalla en consola
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