/*
Escribir un programa que te pregunte por dos n´umeros, y a continuaci´on imprima un mensaje
del estilo “La suma es: ” y el valor de la suma de ambos n´umeros. Para leer un entero de pantalla,
utilizar el m´etodo Consola.pedirEntero() de la librer´ıa de la materia.
 */
package practica0;



import unpaz.ayp3.*;


public class Ejercicio3 {
     
    

   
    public static void main(String[] args) {
       
        int num1, num2, suma;
        System.out.println("Ingrese  dos números a sumar: ");
          num1= Consola.pedirEntero();
          num2= Consola.pedirEntero();
                 
         suma=num1+num2;
         
             System.out.println("resultado: "+suma);
        
        
        
        
    }
    
}

    
