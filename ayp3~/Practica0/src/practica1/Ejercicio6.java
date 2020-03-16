
package practica1;


public class Ejercicio6 {

    
    public static void main(String[] args) {
        
         Fecha fn = new Fecha(2,3,2020);
         Fecha fn2 = new Fecha(2,3,2021);
         Fecha fn3 = new Fecha (29,01,1970);
         Fecha fn4 = new Fecha (29,05,1995);
         Fecha fn5 = new Fecha (30,8,1997);
         Fecha fn6 = new Fecha (30,8,1997);
        
         Persona p = new Persona ("camili",fn);
         Persona p1 = new Persona ("pepe",fn2);
         Persona p2 = new Persona ("pepito",fn3);
         Persona p3 = new Persona ("juancito",fn4);
         Persona p4 = new Persona ("juana",fn5);
         
         
         int tam = 4;
         
         
         String tel [] = new String [tam];
         tel [0] = "234143";
         tel [1] = "4343423";
         tel [2]= "24324234234";
         tel [3] = "4534535434";
         Persona grupo [] = new Persona [tam];
         grupo [0]= p;
         grupo [1]= p1;
         grupo[2]= p3;
         grupo[3] =p4; 
          
         
         
        Agenda ag = new Agenda (tam);
        
        ag.guardar(grupo[0], tel[0]);
        ag.guardar(grupo[1], tel[1]);
        ag.guardar(grupo[2], tel[2]);
        ag.guardar(grupo[3], tel[3]);
        Persona otra = new Persona ("juan",fn6);
        String telefono = "3233442342";
        
        ag.mostrar();
        //ag.eliminar(otra);
       // ag.eliminar(grupo[2]);
       System.out.println(ag.pertenece(grupo[0])) ;
        
        
       
        
        
    }
    
}
