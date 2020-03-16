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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Punto p = new Punto (2,3);
        Punto p2 = new Punto (1,3);
        double distancia;
        p.imprimir();
        //p.desplazar(1.4,1.3);
       // p.imprimir();
        p2.imprimir();
        distancia = Punto.distancia(p, p2);
        System.out.println("distancia :"+distancia);
        
       
    } 
    
}
