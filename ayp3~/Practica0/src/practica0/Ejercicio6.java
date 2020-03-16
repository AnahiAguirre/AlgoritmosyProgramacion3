/*
 Escribir un m ́etodo static void imprimirSuma(int a, int b) que al igual que el ejercicio 4 im-
prima la suma de los dos par ́ametros. Modificar el programa de dicho ejercicio para que utilice este

m ́etodo.
 */
package practica0;

import unpaz.ayp3.*;
public class Ejercicio6 {
    
    
 public static void main(String[] args) {
     
      System.out.println("Ingrese  dos números a sumar: ");
      int num1,num2,resultado;
          num1= Consola.pedirEntero();
          num2= Consola.pedirEntero();
     
       imprimirSuma(num1,num2);
       imprimirPromedio(num1,num2);
        
         
         
             

}
static void imprimirSuma(int a, int b){
 int  suma;
       
                 
         suma=a+b;
         System.out.println("la suma es:"+suma);
         


}
/*
An´alogamente al ejercicio anterior, escribir un m´etodo static void imprimirPromedio(int a, int b)
que imprima el promedio de los dos par´ametros.
*/

static void imprimirPromedio(int a, int b){

float promedio;
    promedio=(a+b)/2;

    System.out.println("El promedio es: "+promedio);

}

}