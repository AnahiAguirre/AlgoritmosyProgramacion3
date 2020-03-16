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
public class Circulo {
    
    double radio;
    Punto centro;
  
    
    Circulo(double centro_x, double centro_y, double radio){
    this.centro = new Punto (centro_x,centro_y);    
    this.radio = radio;
    }
    
    void imprimir(){
     System.out.println("centro: ("+this.centro.x+";"+this.centro.y+")");
     System.out.println("radio: "+this.radio);
    
    }
    
    double perimetro(){
        double pi = 3.1415;
        double peri = 2 * pi * this.radio;
        
    return peri;
    }
    
    double superficie(){
    double pi = 3.1415;
    
    double superf = pi * Math.sqrt(this.radio); 
    
    return superf;
    }
   /* void escalar(double factor){
    *********no tengo idea que es esto
    }
*/
    
    
    void desplazar(double desp_x, double desp_y){
       this.centro.x+=desp_x;
       this.centro.y +=desp_y;
    }
    
    static double distancia(Circulo c1, Circulo c2){
        double entrex = c2.centro.x - c1.centro.x;
        double entrey = c2.centro.y - c1.centro.y;
        double distancia = Math.sqrt(entrex*entrex + entrey*entrey );
    return distancia;
    }
}
