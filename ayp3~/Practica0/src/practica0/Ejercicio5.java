/*
Escribir un programa que te pregunte por dos n´umeros, y a continuaci´on imprima un mensaje
del estilo “El promedio es: ” y el valor del promedio de ambos n´umeros.
 */
package practica0;

import unpaz.ayp3.Consola;


public class Ejercicio5 {

    public static void main(String[] args) {
       int num1,num2,suma;
       float promedio;
       
       System.out.println("Ingrese dos numeros: ");
       num1= Consola.pedirEntero();
       num2= Consola.pedirEntero();
       
       suma=num1+num2;
       
       System.out.println("El resultado de la suma es: "+suma);
       promedio=suma/2;
       System.out.println("El promedio es: "+promedio);
       
       
    }
    
}
