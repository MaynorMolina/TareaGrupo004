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
public class Doctor extends Persona {
    Scanner s = new Scanner(System.in);

    public Doctor(String cadena, int datonumerico, int edad, String nombre) {
        super(cadena, datonumerico, edad, nombre);
    }

   
 

   
    public void set_cadena() {
        
        //aqui hago referencia a la variable dato cadena como el nombre de la carrera del estudiante
        System.out.println("Ingrese de que universidad egreso: ");
        setDatocadena(s.nextLine());
    }

   
    public void set_datonumerico() {
        System.out.println("Ingrese cuantos años de experiencia tiene: ");
        setDatonumerico(s.nextInt());
    }
     public void set_datospersonales()
    {
        System.out.println("Ingrese su nombre: ");
        setNombre( s.nextLine());
        System.out.println("Ingrese su edad: ");
        setEdad(s.nextInt());
       
        
    }


 
    public void Mostrar() {
        System.out.println("Nombre:---------------------"+getNombre());
        System.out.println("Edad:-----------------------"+getEdad());
        System.out.println("Universidad:----------------"+getcadena());
        System.out.println("Años experiencia:-----------"+getDatonumerico());
    }
    
}
