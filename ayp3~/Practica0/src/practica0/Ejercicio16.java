/*
Escribir un m´etodo static double factorial(int n) que toma un entero positivo n y calcula
n! (el factorial de n) que se define como el producto de todos los naturales desde 1 hasta n. Por
ejemplo 5! = 5 × 4 × 3 × 2 × 1 = 120. Ojo: por definici´on, el factorial de 0, es 1 (0! = 1).

 */
package practica0;

import unpaz.ayp3.Consola;

/**
 *
 * @author elizabeth.aguirre
 */
public class Ejercicio16 {
    public static void main(String[] args) {
    
    int num;
    num = Consola.pedirEntero();
    
    System.out.println(factorial(num));
    
    
    }
    
    
    
    static double factorial(int n){
    if (n == 0){
    return 1;
    } else return   n * factorial(n-1);
    
    }
}
