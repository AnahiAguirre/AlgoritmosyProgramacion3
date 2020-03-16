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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fraccion frac1 = new Fraccion (3,2);
        Fraccion frac2 = new Fraccion (5,2);
            
        frac1.imprimir();
        frac2.imprimir();
        //frac1.invertirSigno();
         //frac1.imprimir();
        // frac1.invertir();
         //frac1.imprimir();
         //System.out.println(frac1.aDouble());
         System.out.println("producto "+Fraccion.producto(frac1, frac2).numerador+"/"+Fraccion.producto(frac1, frac2).denominador);
        System.out.println("suma "+Fraccion.suma(frac1, frac2).numerador+"/"+Fraccion.suma(frac1, frac2).denominador);
        
    }
    
}
