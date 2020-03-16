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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c  = new Circulo(0,0,1);
        Circulo c2 = new Circulo (3,0,4);
        c.imprimir();
       
        System.out.println("Perimetro: "+c.perimetro());
        System.out.println("Superficie: "+c.superficie());
        //c.desplazar(1, 3);
        //c.imprimir();
        double dis = Circulo.distancia(c, c2);
        System.out.println("distancia "+dis);
        
        
        
          
    }
    
}
