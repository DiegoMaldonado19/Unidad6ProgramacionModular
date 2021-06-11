/**
 * Especificamos el paquete src, que es donde se encuentra nuestro codigo fuente
 */
package src;
public class Ejercicio6 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de esta clase para evitar problemas con el ambito estatico
         */
        Ejercicio6 ejercicio6 = new Ejercicio6();
    }

    /**
     * Constructor donde se llaman a los metodos que desarrollan la logica
     */
    public Ejercicio6(){
        /**
         * Inicializamos matriz y la mostramos en pantalla
         */
        matrizOriginal = inicializarMatriz();
        System.out.println("Matriz original: ");
        mostrarMatriz(matrizOriginal);
        System.out.println("Matriz nueva: ");
        /**
         * Luego le sumamos 2 a cada uno de sus elementos e imprimimos en pantalla
         */
        mostrarMatriz(sumarMatriz(matrizOriginal));
    }

    /**
     * Matriz original definida globalmente
     */
    int[][] matrizOriginal = new int[3][3];

    /**
     * Metodo que retorna una matriz la cual será nuestra matriz original
     * @return
     */
    public int[][] inicializarMatriz(){
        int[][] matrizOriginal = new int[3][3];

        matrizOriginal[0][0] = 5;
        matrizOriginal[0][1] = 6;
        matrizOriginal[0][2] = 13;
        matrizOriginal[1][0] = 14;
        matrizOriginal[1][1] = 2;
        matrizOriginal[1][2] = 4;
        matrizOriginal[2][0] = 21;
        matrizOriginal[2][1] = 7;
        matrizOriginal[2][2] = 6;
        return matrizOriginal;
    }

    /**
     * Metodo para mostrar cualquier matriz en consola
     * @param matriz
     */
    public void mostrarMatriz(int[][] matriz){
        for(int i=0; i<matrizOriginal.length; i++){
            for(int j=0; j<matrizOriginal.length; j++){
                if(j==2){
                    System.out.println(matriz[i][j]);
                }
                else{
                    System.out.print(matriz[i][j]+" | ");
                }
            }
        }
    }

    /**
     * Metodo que retorna el resultado de sumar 2 a cada uno de los elementos de la matriz original
     * @param matrizNueva
     * @return
     */
    public int[][] sumarMatriz(int[][] matrizNueva){
        for(int i=0; i<matrizOriginal.length; i++){
            for(int j=0; j<matrizOriginal.length; j++){
                matrizNueva[i][j] += 1;
            }
        }
        return matrizNueva;
    }

}
