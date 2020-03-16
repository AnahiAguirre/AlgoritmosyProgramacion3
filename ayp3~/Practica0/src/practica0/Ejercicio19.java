/*
 Escribir un programa que pida por pantalla un texto y a continuaci´on lo imprima de
atr´as para adelante. Para obtener las letras de una cadena de caracteres pueden 
    utilizar el m´etodo charAt de String. Por ejemplo, cadena.charAt(0) devuelve el primer
caracter del String cadena.
*/
package practica0;

import unpaz.ayp3.*;

/**
 *
 * @author elizabeth.aguirre
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
    String cadena;
   // string aux='';
    System.out.println("ingrese texto");
    cadena = Consola.pedirTexto();
    System.out.println(reversa(cadena));

}
    
    
    
        
  static String reversa(String cadena) {
  
      int i;
      String aux="";
   for(i = cadena.length()-1;i>=0;i-- ){
   
      //System.out.print(cadena.charAt(i));
      aux+= cadena.charAt(i);
   }
  
   
     return aux;
      
        
    
   
}
}
