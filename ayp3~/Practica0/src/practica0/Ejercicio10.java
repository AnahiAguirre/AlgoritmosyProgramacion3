/*
 a) Escribir un programa que te pregunte por un n´umero e imprima un mensaje de tipo “[x] es
par” si el n´umero es par (reemplazando [x] por el n´umero en cuesti´on). En caso contrario, debe
imprimir “[x] es impar”.
b) Crear un m´etodo static boolean esPar(int n) que devuelve true si n es par, y false en caso
contrario.
c) Modificar el main del programa para que utilice este m´etodo
 */
package practica0;


import unpaz.ayp3.Consola;

/**
 *
 * @author elizabeth.aguirre
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        System.out.println("Ingrese un numero:");
        num=Consola.pedirEntero();
        boolean par;
        //numeropar(num);
        par= esPar(num);
         if (!par) {
             System.out.println(num+"es impar");
        
        } else  System.out.println(num+"es par");
        
    }
    
    static void numeropar(int a){
        if(a%2==0){
            System.out.println("es par");
    }else 
        {
    
        System.out.println("es impar");
}
    }
    
    static boolean esPar(int n){
        return n%2==0;
    }    
        
    
    
}