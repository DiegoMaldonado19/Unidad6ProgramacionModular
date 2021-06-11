package src;
public class Ejercicio7 {
    public static void main(String[] args){
        /**
         * Declaramos un objeto de esta clase para evitar problemas con el ambito estatico
         */
        Ejercicio7 ejercicio7 = new Ejercicio7();
    }

    /**
     * Constructor para la clase, el cual contiene las llamadas a los metodos con nuestra logica
     */
    public Ejercicio7(){

        /**
         * Llenamos matriz llamando a su metodo y guardando lo que retorna
         * Luego mostramos la matriz e imprimimos en pantalla la sumatoria de los numeros de las filas pares
         */
        matrizAleatoria = llenarMatriz();
        mostrarMatriz(matrizAleatoria);
        System.out.println("La sumatoria de los numeros dentro de una fila par es: "+sumatoria);
    }

    /**
     * Arreglo bidimensional para almacenar numeros aleatorios 
     * Variables para almacenar la sumatoria de numeros en fila par
     */
    int[][] matrizAleatoria = new int[4][3];
    int sumatoria=0;

    /**
     * Metodo que llena una matriz 4x3 con numeros aleatorios y retorna su valor
     * @return
     */
    public int[][] llenarMatriz(){
        int[][] matriz = new int[4][3];
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                matriz[i][j] = (int)(Math.random()*555);
                if(i==1){
                    /**
                     * Si la iteracion en i es igual a 1 o 3, quiere decir que estamos en una fila par
                     * Por lo tanto, se realizara la sumatoria de numeros 
                     */
                    sumatoria += matriz[i][j];
                }
                else if(i==3){
                    sumatoria += matriz[i][j];
                }
            }
        }

        return matriz;
    }

    /**
     * Metoo para mostrar la matriz que se lleno de numeros aleatorios
     * @param matriz
     */
    public void mostrarMatriz(int[][] matriz){
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                if(j==2){
                    System.out.println(matriz[i][j]);
                }
                else{
                    System.out.print(matriz[i][j]+" | ");
                }
            }
        }
    }
}
