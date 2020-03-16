/*
   Escribir un m ́etodo static int cantidadVocales(String s) que dada una cadena que contiene
s ́olo letras min ́usculas sin acentuar, devuelve la cantidad de vocales en dicha cadena. Nota: se puede
utilizar el m ́etodo definida en el ejercicio anterior. */
package practica0;

import unpaz.ayp3.*;

/**
 *
 * @author elizabeth.aguirre
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String cadena;
      int vocales;
      System.out.println("ingrese una cadena: ");
      cadena = Consola.pedirTexto();
      
      vocales = cantidadVocales(cadena);
      System.out.println(+vocales);
    }
    
    static int cantidadVocales(String s){
    int contador=0,x,y;
    String vocales = "aeiou";
    
   for(y=0; y<s.length(); y++){
   
   
    for(x=0;x<vocales.length();x++){
    if (vocales.charAt(x)==s.charAt(y)){
       
        
        
    contador ++;
    }
    
    }
   }   
    return contador;
    
    }

}
