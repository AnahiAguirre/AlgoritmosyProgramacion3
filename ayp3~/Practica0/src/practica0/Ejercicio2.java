/*
Escribir un programa que te pregunte tu nombre y a continuaci´on imprima un saludo del estilo
“Hola [nombre]”. Para leer un texto por teclado, utilizar el m´etodo Consola.pedirTexto() de la
librer´ıa de la materia.

 */
package practica0;
import unpaz.ayp3.*;
/**
 *
 * @author elizabeth.aguirre
 */
public class Ejercicio2 {

   
    public static void main(String[] args) {
        String nombre;
        
       System.out.println("ingrese su nombre: ");
            nombre=Consola.pedirTexto();
       
         System.out.println("Hola "+nombre);

    }
    
}
