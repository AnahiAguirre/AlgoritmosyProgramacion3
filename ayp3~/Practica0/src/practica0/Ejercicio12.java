package practica0;

import unpaz.ayp3.Consola;






/*
 Escribir un m´etodo static boolean esDivisible(int n, int m)
que devuelve true si n es divisible por m y false en caso contrario.
Probarlo adecuadamente llam´andola desde el main.

package practica0;

/**
 *
 * @author elizabeth.aguirre
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1,num2;
        boolean divisible;
        System.out.println("ingrese dos numeros");
        num1 = Consola.pedirEntero();
        num2 = Consola.pedirEntero();
        divisible= esDivisible(num1,num2);
        
        if (divisible == true){
            System.out.println(num1+" es divisible por: "+num2);
            
        }else System.out.println(num1+" no es divisible por: "+num2);
    }
    
  static boolean  esDivisible(int n, int m){
      
      if (n%m == 0 ){
      return true;
  }else return false;
    
}
}
