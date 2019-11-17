/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasedeportista;

/**
 *
 * @author Jesus Acosta
 */
public class Deportista extends Persona{
    public Deportista(String cadena, int datonumerico, int edad, String nombre) {
        super(cadena, datonumerico, edad, nombre);
    }

  //aqui hago referencia a la variable dato cadena como el deporte que practica la persona
    public void set_cadena() {
        System.out.println("Que deporte practicas: ");
        setDatocadena(s.nextLine());
    }

// aqui hago referencia a la variable dato numerico como el tiempo de expericia en el deporte
    public void set_datonumerico() {
        System.out.println("Dime hace cuantos años lo practicas: ");
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
        System.out.println("Nombre:-----------------"+getNombre());
        System.out.println("Edad:------------------ "+getEdad());
        System.out.println("Deporte:----------------"+getcadena());
        System.out.println("Experiencia:------------"+getDatonumerico()+" años");
    }
    
}
