/*
 Escribir un m´etodo static double potencia(double x, int a) que toma un n´umero racional
x y un entero a y calcula x
a
.
 */
package practica0;

import unpaz.ayp3.Consola;

/**
 *
 * @author elizabeth.aguirre
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int exp;
        double base;
      
        base = Consola.pedirDecimal();
          exp = Consola.pedirEntero();
        
        
        System.out.println(potencia (base,exp));
        
    }
    
    
    static double potencia(double x, int a){
        if (a == 0 ){
        return 1;
        }else return x * potencia(x,a-1); 
        
        
    }

   
}

