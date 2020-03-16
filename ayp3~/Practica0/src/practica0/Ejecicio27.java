/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica0;

import unpaz.ayp3.Consola;

/**
 *
 * @author elizabeth.aguirre
 */
public class Ejecicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        System.out.println ("ingrese un numero ");
        n = Consola.pedirEntero();
        
         collatz(n);
    }
     public static void collatz(int n) {
       System.out.println(n + " ");
               
        if (n == 1) ;
        
        else if (n % 2 == 0)
        {
             
            collatz(n / 2);
             
           
        } 
            else collatz(3*n + 1);
        
    }
}
