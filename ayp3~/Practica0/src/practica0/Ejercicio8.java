/*
Escribir un m ́etodo static void ponerNota(double x, double y) que toma dos n ́umeros de-
cimales y los promedia. En caso que el promedio sea mayor o igual a 7, deber ́a imprimir

‘‘Promocionado’’, si es mayor o igual a 4 pero menor que 7, imprime ‘‘Aprobado’’ y si es menor
que 4 imprime ‘‘Debe recuperar’’. Probarla llam ́andola desde el main con distintos n ́umeros.
Luego, pedirle  ́ambos n ́umeros al usuario con el m ́etodo Consola.pedirDecimal() para pas ́arselos
a ponerNota.
 */
package practica0;

import unpaz.ayp3.Consola;

/**
 *
 * @author elizabeth.aguirre
 */
public class Ejercicio8 {
    
    public static void main(String[] args) {
    
    double num1, num2;
    
    System.out.println("ingrese las notas");
    num1 = Consola.pedirDecimal();
    num2 = Consola.pedirDecimal();
    
    
    ponerNota(num1,num2);
    
    }
    
    static void ponerNota(double x, double y){
      
        double promedio;
        
        promedio= ((x+y)/2);
        
     if (promedio>=7){
         
         
         System.out.println("promocionado con:"+promedio);
          
         } if(promedio>=4 && promedio<7){
             
             
         System.out.println("aprobado con "+promedio);
         
         
         }if(promedio<4){
                  System.out.println("debe recuperar!!!!");

         
         }
               
    
    } 
               
       } 
    
    
    

