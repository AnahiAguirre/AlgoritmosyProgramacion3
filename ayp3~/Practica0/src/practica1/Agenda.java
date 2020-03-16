
package practica1;


public class Agenda {
    
   
Persona[] contactos;
String[] telefonos;

Agenda(int tamanio){

 this.contactos = new Persona [tamanio];
 this.telefonos = new String [tamanio];
 
}

void guardar(Persona contacto, String telefono){

    int i=0;
    boolean vacioc = false;
    boolean vaciot = false;
    
    
    while( i < contactos.length && vacioc == false && vaciot == false){
        if(contactos[i]== null){
            
            contactos[i] = contacto;
            vacioc = true;
            
        }
        if(telefonos[i]== null){
        
            telefonos [i]= telefono;
            vaciot= true;
        
            
        }
    
        i++;
    }
 

    
    
}

void mostrar (){

   
    for  (int i = 0; i < contactos.length ; i++){
         
         System.out.println("Posición: "+i);
         System.out.println("nombre: "+contactos[i].nombre);
         System.out.println("fecha de nacimiento: "+contactos[i].fecha_nacimiento);
         System.out.println("telefono: "+telefonos[i]);
    
    
    }
       
       } 

    
void eliminar(Persona contacto){
    
    int i = 0;
    boolean misma, corte = false ;
    
         while (i < contactos.length && corte == false){
        misma = contactos[i].mismaPersona(contacto);
        if(misma== true){
            
        System.out.println("la persona se encontro dentro de la agenda: "+contacto.nombre);
        contactos[i].nombre= null;
        contactos[i].fecha_nacimiento = null;
        telefonos[i]= null;
        corte = true;
        
        }
           
          i++;
          
                   }
       System.out.println("la persona no se encontro en la agenda");
          
  
        
    }
boolean pertenece(Persona contacto){
    boolean resul = false;
    for (int i= 0 ; i < contactos.length-1 ; i++){
       
        
        if(contactos[i]!= null){
        
            if( contactos[i].equals(contacto) ){
              
                resul = true;
                break;
        }
        
        }
       
    
    }


return resul;}

String dameTelefono(Persona contacto){

    String tel = null;
    
    boolean esta = pertenece(contacto);
    boolean misma ;
    for (int i = 0; i < contactos.length-1; i ++){
               
            
    
    }
    
            
            
return tel;}

}






