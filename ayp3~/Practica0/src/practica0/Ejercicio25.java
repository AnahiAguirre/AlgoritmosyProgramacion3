
package practica0;

import unpaz.ayp3.Consola;

/**
 *
 * @author elizabeth.aguirre
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String cadena;
      System.out.println("ingrese una cadena");
      cadena = Consola.pedirTexto();
      
      System.out.print(sinRepetidos(cadena));
     
      
      
    }
    static String sinRepetidos(String s){
    
    	
    	
    	String nuevo = "";
		Character letra = null;
		boolean valido = false;

		for (int i = 0; i < s.length(); i++) {
			valido = false;
			for (int j = i + 1; j < s.length(); j++) {
				letra = s.charAt(j);

				if (s.charAt(i) == letra) {
					valido = true;
					break;
				}
			}
			if (valido == false)
				nuevo= nuevo + s.charAt(i);
		}

		return nuevo;

	}
    	
    	
    	
  }
    
    




