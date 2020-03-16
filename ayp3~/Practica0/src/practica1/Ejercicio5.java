/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import practica1.Arreglos;
public class Ejercicio5 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] a = {1,2,2,4,5};
        int [] b= {1,2,3,4,7,5};
        
        Arreglos.mostrar(Arreglos.pegar(a, b));
        System.out.println("");
        System.out.println(Arreglos.esSinRepetidos(a));
       
        Arreglos.mostrar(Arreglos.agregarAlFinal(a, 3));
        System.out.println("");
         
         
      // Arreglos.mostrar(  Arreglos.sinRepetidos(a));
       Arreglos.invertir(a);
        
        
    }
    
    
}
