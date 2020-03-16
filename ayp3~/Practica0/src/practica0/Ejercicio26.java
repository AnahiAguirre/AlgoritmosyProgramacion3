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
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
       TInicio = System.currentTimeMillis();
        // TODO code application logic here
        int n;
        
        System.out.println("ingrese un numero");
        n = Consola.pedirEntero();
        
        System.out.println(fibrec(n));
       //System.out.println(fibiter(n)); 
       TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
  tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);        
    }
    static int fibrec(int n){
    
    if(n == 0){
    
    return 0;
    }else if(n ==1){
    
    return 1;
    }else {
    
    
    return fibrec (n-1)+ fibrec (n-2);
    }
    
    
 
    
    
    }
    
    static int fibiter(int n){
    int suma=0;
        if(n == 0){
        return 0;       
        }else if(n == 1){
        return 1;
        }else{
        for ( int i = 0;i < n; i++ ){
        suma+=(n-i);
        }
        return suma;}
    
    }
}
