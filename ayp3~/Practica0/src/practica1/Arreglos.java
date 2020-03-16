import  Bit
        
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author elizabeth.aguirre
 */
public class Arreglos {
  static boolean esSinRepetidos(int[] arr){
  
      for( int i =0 ; i<arr.length; i++){
          
        for (int j = i +1; j < arr.length; j ++){
            
            if(arr[i]==arr[j])
                
                return false; 
        }
     
      }
      
  return true;
  } 
  
  static int [] pegar(int[] arr, int [] arr2){
  
      int [] nuevo = new int [arr.length + arr2.length];
      
      for (int i = 0; i<arr.length ; i++){
       
          nuevo [i]= arr[i];
      
      }
      for (int i = 0; i< arr2.length;i++){
         nuevo[arr.length + i]=arr2[i];
      }
   return nuevo;   
  }
  
  static void mostrar (int[] arr){
      for( int i =0 ; i<arr.length ; i ++){
          
         System.out.print(+arr[i]+","); 
      }
  
  
  }
  
  
  static int [] agregarAlFinal(int[] arr, int elem){
 
      int [] nuevo = new int [arr.length +1];
  
      for (int i = 0; i <arr.length;i++){
          nuevo [i]= arr[i];
          nuevo [nuevo.length-1]=elem;
      
      
      }
  
  return nuevo;
  }
 /* static int [] sinRepetidos(int[] arr){
      
      int [] nuevo = new int [arr.length];
      int vacio;
      boolean estado = false;
  for( int i =0 ; i<arr.length; i++){
          
        for (int j = i +1; j < arr.length; j ++){
            
            if(arr[i]==arr[j]){
             estado = true;
             
            
            }
                
              
        }
        
     if (estado == false){
     
         nuevo [i]= arr[i];
     
     } 
     estado = false;
      }
      
  return nuevo;
  
  }*/
  
  static void invertir(int[] arr){
 int aux;

		for (int i = 0; i < arr.length / 2; i++) {

			aux = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = aux;

		}

		
		
		
		for (int i = 0; i < arr.length; i++) {

			System.out.print( arr[i]+",");

		}

		
  
  }
}
