/*
 Escribir un metodo static boolean esSinRepetidos(String s) que dada una cadena, devuelve
true si no hay letras repetidas en la cadena. En caso contrario, devuelve false.
 */
package practica0;

import unpaz.ayp3.*;

/**
 *
 * @author elizabeth.aguirre
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
    System.out.println("ingrese una cadena");
    String cadena;
    cadena = Consola.pedirTexto();
    System.out.println("es sin repetidos?"+esSinRepetidos(cadena));
    
    
    }
    
    static boolean esSinRepetidos(String s){
    int i,j, contador=0;
    boolean res=true;
    char letra;
    for (i = 0; i < s.length(); i++){
    letra = s.charAt(i);
        for (j= 0; j<s.length(); j++){
        if (letra==s.charAt(j)){
        contador ++;
        
         
        }
        if(contador > s.length())res = false;
          
        
        }
    
    }
   
         
    
    return res;
    }
}