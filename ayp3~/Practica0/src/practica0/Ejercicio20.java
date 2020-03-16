/*
 Escribir un m´etodo static int cantidadApariciones(String s, char c) que dada una cadena
y un caracter, cuenta la cantidad de veces que aparece c en s.


*/
package practica0;

import unpaz.ayp3.*;

/**
 *
 * @author elizabeth.aguirre
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String cadena;
    char car;
        System.out.println("ingrese texto");
    cadena = Consola.pedirTexto();
    car= Consola.pedirTexto().charAt(0);
    System.out.println(cantidadApariciones(cadena, car));
        
    }
    static int cantidadApariciones(String s, char c){
    
        int i, cant= 0;
        for(i=0 ; i< s.length(); i++ ){
            if(s.charAt(i) == c){
            cant++;
            
            }
        
        
        }
        
    return cant;
    
    
    }
}
