/*
 Escribir un m´etodo static int sumatoriaPares(int n) que devuelve la sumatoria de los
 n´umeros pares desde 2 hasta n. Nota: se puede usar el m´etodo del ejercicio 10.
 */
package practica0;

import unpaz.ayp3.*;

/**
 *
 * @author elizabeth.aguirre
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      int num, sumatoria;
        System.out.println("Ingrese un numero: ");
            num = Consola.pedirEntero();
        
            sumatoria = sumatoriaPares(num);
            System.out.println("la sumatoria de : "+num +" es " +sumatoria);
      
    }
    
   
        
    static int sumatoriaPares(int n){
    if (n == 2 ){
    return 2;
    }else return sumatoriaPares(n+2)+2;
    
      
    }
      
    }
     
   
    
    
     
        

