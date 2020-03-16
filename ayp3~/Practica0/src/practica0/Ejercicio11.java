/*
 Escribir un m´etodo static int cantCifras(int n) que devuelve la cantidad de cifras de n.
Probarlo adecuadamente llam´andola desde el main.

 */
package practica0;

import unpaz.ayp3.Consola;

/**
 *
 * @author elizabeth.aguirre
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,Cifras;
        
        num= Consola.pedirEntero();
        Cifras = cantCifras(num);
        System.out.println("tiene :"+Cifras+" cifras");
        
        
        
    }
static int cantCifras(int n){
  if (n<10){
        System.out.println("pasa por el if n= "+n);
  return 1;
  
  }else{
      System.out.println("pasa por el else n= "+n);
      return 1 + cantCifras(n/10);
  }
     
 }   
}
