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
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num, num2;
       num = Consola.pedirEntero();
       //num2 = Consola.pedirEntero();
    
    
       
      //System.out.println(iterSumatoria(num));   
     //  System.out.println(iterSumatoriaPares(num));
       //  System.out.println(iterPotencia(num,num2));    
       System.out.println(iterfactorial(num));
    }
    static int iterSumatoria(int n){
    int i,contador;
                if(n==0){
                return 1;
                }else{
                    contador=n;
                 for(i = 1; i<n ; i++ )   {contador+=i;}      
                    
                 return contador; 
                }
     
   
    }
    
    static int iterSumatoriaPares(int n){
    
     int i,contador=0;
                if(n==0){
                return 1;
                }else{
                    
                     
                 for(i = 1; i<=n ; i++ )   {
                     
                     
                     if(i%2 == 0 ) {                   
                        
                        contador+=i;
             
                     }
                 } 
                    
                    
                        
                    
                 return contador; 
                }
    }
    
    static int iterPotencia(int base,int exp ){
         int i=1, resultado=base;
         if(exp == 0){
         return 1;
         }else{
      
         while(i < exp){
            resultado*=base;
            System.out.println(resultado);
               i++;
         }
         
    return resultado;
         }
    
    
      
    
}
    
     static int iterfactorial(int n){
    int i , resultado ;
        if(n == 0){
        return 1;
        }else{
            
            resultado = n;
           for(i=1; i<n; i++){
           resultado*=(n-i);
           
           }
            
            
            return resultado;
            }
        
         }
           
 } 

