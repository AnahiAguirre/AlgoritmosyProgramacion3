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
public class Fecha {
    int dia;
    int mes;
    int anio;
    
    
    
    Fecha(int d, int m, int a){
    
        this.dia = d;
        this.mes = m;
        this.anio =a;
    
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

   
    
    
   
  public String toString() {

		return this.dia + " - " + this.mes + " -" + this.anio;

	}
}
