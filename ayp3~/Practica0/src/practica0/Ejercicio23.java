/*
 Escribir el m Ì�etodo static boolean esCapicua(String s) que dada una cadena, devuelve true
si la cadena es igual de atr Ì�as hacia adelante o de adelante hacia atr Ì�as. En caso contrario, devuelve
false.
 */
package practica0;



import unpaz.ayp3.*;

/**
 *
 * @author elizabeth.aguirre
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
    String cadena;
      System.out.println("ingrese una palabra");
      cadena = Consola.pedirTexto();
       System.out.print("la palabra es capicua?:");
               System.out.println();
    System.out.println(esCapicua(cadena));
    
    
    }
    static boolean esCapicua(String s){
   String copia = "";
   boolean resultado;
   
    for (int x=s.length()-1; x>=0 ; x--){
        
        
        copia += s.charAt(x);
        
    }
    System.out.println(copia);
   
   resultado = s.equals(copia);
   return resultado;  
}
}