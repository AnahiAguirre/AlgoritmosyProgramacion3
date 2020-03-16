
package practica1;

public class Persona {
    
    String nombre;
    Fecha fecha_nacimiento;
    
    
    
   Persona(String nombre, Fecha f_nac){
   
       this.nombre = nombre;
       this.fecha_nacimiento = new Fecha(f_nac.dia,f_nac.mes,f_nac.anio);   
             
   }
   
   boolean masJovenQue(Persona otro){
   boolean jv=false;
    
    if(this.fecha_nacimiento.anio>otro.fecha_nacimiento.anio) {jv = true;}
    else if(this.fecha_nacimiento.anio==otro.fecha_nacimiento.anio){
            if(this.fecha_nacimiento.mes>otro.fecha_nacimiento.mes){
               jv=true;
            }
    }
            else if(this.fecha_nacimiento.mes==otro.fecha_nacimiento.mes){
              if(this.fecha_nacimiento.dia>otro.fecha_nacimiento.dia){
            jv = true;
             }
              else jv = false;
            }    
    
    
    
       
    return jv;
}
   boolean tocayo(Persona otro){
   if(this.nombre == otro.nombre){
   return true;
   }else return false;
   }
   
   boolean mismaPersona(Persona otro){
   if( this.nombre.equals(otro.nombre) && this.fecha_nacimiento.anio == this.fecha_nacimiento.anio){
       
       return true;
   }else return false;
   }
   
   
   static Persona masJoven(Persona[] grupo){
   Persona joven = null;
   
   for (int i =0; i< grupo.length; i++){
       
        for (int j = i+1 ; j<grupo.length;j++){
              
            if(grupo[i].masJovenQue(grupo[j])){
           
                 joven = grupo[i];
           
       }
       }
    
       
   
   }
   return joven;
   }
   static Persona buscar(Persona[] grupo, String nombre){
       
       Fecha fn = new Fecha (2,3,4);
       Persona p= new Persona ("La persona buescada no se encuentra en el grupo",fn);
       
       boolean encontrado= false;
       int i=0;
   
   while (i< grupo.length && !encontrado){
   
       if (grupo[i].nombre.equals(nombre)) {
   
       
           p = grupo[i];
           
           encontrado = true;
   }  
      i++;
      
      
   }
  
      
    
    return p;
    }
       
   
   
   
   
  
 
}
