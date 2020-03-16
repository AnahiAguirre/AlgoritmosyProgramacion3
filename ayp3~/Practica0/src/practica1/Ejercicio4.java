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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha fn = new Fecha(2,3,2020);
        Fecha fn2 = new Fecha(2,3,2021);
        Fecha fn3 = new Fecha (29,01,1970);
        Fecha fn4 = new Fecha (29,05,1995);
        Fecha fn5 = new Fecha (30,8,1997);
        
       Persona p = new Persona ("camili",fn);
       Persona p1 = new Persona ("pepe",fn2);
       Persona p2 = new Persona ("pepito",fn3);
       Persona p3 = new Persona ("juancito",fn4);
       Persona p4 = new Persona ("juana",fn5);
           
       Persona [] grupo = new Persona [5];
       
          grupo[0]= p;
          grupo[1]= p1;
          grupo[2]= p2;
          grupo[3]= p3;
          grupo[4]= p4;       
           
        System.out.println(fn.toString());
        System.out.println(fn2.toString());
        System.out.println( p.masJovenQue(p1));
        System.out.println(p.tocayo(p1));
        System.out.println(p.mismaPersona(p1));
        System.out.println(Persona.masJoven(grupo).fecha_nacimiento);
        System.out.println(Persona.buscar(grupo, "juan").nombre);
        
      
       
       
     
       
       
    }
    
}
