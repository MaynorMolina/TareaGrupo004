/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareagrupo004;

import java.util.Scanner;

/**
 *
 * @author Maynor Molina
 */
public abstract class Persona  {
    
     Scanner s = new Scanner(System.in);
    //declaracion de variables para polimorfismo y encapsulamiento 
     
       private  String cadena;
       private int datonumerico;
       private int edad;
       private String nombre;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

       
      
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }


       
       
       
      
       
       
       
   //declaracion de constructor
    public Persona(String cadena, int datonumerico, int edad, String nombre) {   
        this.cadena = cadena;
        this.datonumerico = datonumerico;
        this.edad = edad;
        this.nombre = nombre;
    }

    //declaracion de getter y setter
    public String getcadena() {
        return cadena;
    }

    public void setDatocadena(String cadena) {
        this.cadena = cadena;
    }

    public int getDatonumerico() {
        return datonumerico;
    }

    public void setDatonumerico(int datonumerico) {
        this.datonumerico = datonumerico;
    }

   
       
       
    //declaracion de metodos 
   
    public abstract void set_datospersonales();
    public abstract void set_cadena();
    public abstract void set_datonumerico();
    public abstract void Mostrar();
    
}
