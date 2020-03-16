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
public class Punto { 
double x;
double y;

Punto(){
this.x = 0;
this.y = 0;
}
Punto(double x, double y){
this.x = x;
this.y = y;
}
void imprimir(){
 System.out.println("("+this.x+";"+this.y+")");
}
void desplazar(double desp_x, double desp_y){
this.x += desp_x;
this.y += desp_y;
}
static double distancia(Punto p1, Punto p2){
double entrex = p2.x -p1.x;
double entrey = p2.y - p1.y;
double distancia = Math.sqrt(entrex*entrex + entrey*entrey );

return distancia;}
}
