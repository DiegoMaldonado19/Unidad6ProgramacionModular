/**
 * Definimos paquete donde se encuentra nuestro codigo fuente
 * E importamos todas las clases del paquete java util
 */
package src;
import java.util.*;
public class Ejercicio11 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase para evitar problemas con el ambito estatico
         */
        Ejercicio11 ejercicio11 = new Ejercicio11();
    }

    /**
     * Constructor de la clase para poder llamar a los metodos
     */
    public Ejercicio11(){
        for(int i=0; i<alumnos.length; i++){
            ingresarNotasPorAlumno(i);
        }
        for(int i=0; i<alumnos.length; i++){
            verificacionNota(i);
        }
        for(int i=0; i<alumnos.length; i++){
            mostrarResultados(i);
        }

    }

    /**
     * Instanciamos objeto de la clase scanner para poder leer desde consola
     * Definimos arreglos para almacenar las notas y nombres de los alumnos, asi como su resultado
     */
    Scanner scanner = new Scanner(System.in);
    String[] alumnos = new String[6];
    double[] notas = new double[6];
    String[] resultadoNota = new String[6];

    /**
     * Metodo para ingresar nombre y nota por alummno
     * @param posicion
     */
    public void ingresarNotasPorAlumno(int posicion){
        boolean notaCorrecta = false;
        System.out.println("-------------------------------------------------------");
        System.out.println("Ingrese el nombre del alummno "+(posicion+1));
        alumnos[posicion] = scanner.nextLine();
        /**
         * Ciclo while para que ingrese un a nota correcta el usuario
         */
        while(notaCorrecta!=true){
            System.out.println("Ingrese la nota del alumno "+(posicion+1));
            notas[posicion] = scanner.nextDouble();
            scanner.nextLine();
            if(notas[posicion]>=0 && notas[posicion]<=10){
                notaCorrecta = true;
            }
            else{
                notaCorrecta = false;
            }
        }
    }

    /**
     * Metodo para asignar un valor en palabras a la nota del alummno
     * @param posicion
     */
    public void verificacionNota(int posicion){
        /**
         * Bifurcaciones condicionales para definir un valor en palabras para la nota
         */
        if(notas[posicion]>=0 && notas[posicion]<=4.99){
            resultadoNota[posicion] = "Suspenso";
        }
        else if(notas[posicion]>=5 && notas[posicion]<=6.99){
            resultadoNota[posicion] = "Bien";
        }
        else if(notas[posicion]>=7 && notas[posicion]<=8.99){
            resultadoNota[posicion] = "Notable";
        }
        else if(notas[posicion]>=9 && notas[posicion]<=10){
            resultadoNota[posicion] = "Sobresaliente";
        }
    }

    /**
     * Metodo que imprime el resultado en palabras de la nota del alummno en consola
     * @param posicion
     */
    public void mostrarResultados(int  posicion){
        System.out.println("El alumno ("+(posicion+1)+") "+alumnos[posicion]+" con nota de: "+notas[posicion]+" su resultado es "+resultadoNota[posicion]);
    }
}
