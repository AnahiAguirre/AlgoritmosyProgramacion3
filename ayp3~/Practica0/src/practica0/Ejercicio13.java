/*
Escribir un m´etodo static int sumatoria(int n) que devuelve la sumatoria de los n´umeros
desde 1 hasta n.
 */
package practica0;

import unpaz.ayp3.Consola;

/**
 *
 * @author elizabeth.aguirre
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, Sumatoria;
         System.out.println("Ingrese un numero: ");
        num = Consola.pedirEntero();
        
        Sumatoria = sumatoria(num);
        System.out.println("la sumatoria de : "+num +" es " +Sumatoria);
        
        
        
    }
    
    
   private static int sumatoria(int n){
        if (n == 0){
            return 0;
        } else return sumatoria (n-1) + n;
        
        
    }

}
