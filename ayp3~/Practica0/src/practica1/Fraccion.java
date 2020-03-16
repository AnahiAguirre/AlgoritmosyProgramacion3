/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;


public class Fraccion{
int numerador;
int denominador;



Fraccion(int numerador, int denominador){
this.numerador = numerador;
this.denominador= denominador;


}
void imprimir (){

System.out.println("la fraccion es: "+numerador+"/"+denominador);

}

void invertirSigno(){
if (this.numerador >0){
  this.numerador= this.numerador*(-1);
  
}else this.numerador= this.numerador*(-1);
  

}
void invertir(){
int aux;
aux = this.numerador;
this.numerador = this.denominador;
this.denominador = aux;
 
}
double aDouble(){
double frac, num, den;
num = this.numerador;
den = this.denominador;
frac = (num/den);
return frac;
}

static Fraccion producto(Fraccion q1, Fraccion q2){
 int num = q1.numerador * q2.numerador;
 int den = q1.denominador * q2.denominador;
   
 return new Fraccion (num,den);
 /*
 
 f)¿Por que en este caso hace falta la palabra clave static?.
 La palabra clava static sirve para definir un método de clase, en este caso
 el resultado no depende ninguna instancia en particular, asi como tampoco se invoca
 sobre ningun objeto.
 
 */

}
static Fraccion suma(Fraccion q1, Fraccion q2){
int num =(q1.numerador*q2.denominador)+(q1.denominador*q2.numerador);
int den = q1.denominador * q2.denominador;

return new Fraccion (num,den);
}
}