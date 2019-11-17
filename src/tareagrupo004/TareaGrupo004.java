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
public class TareaGrupo004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
  
        System.out.println("ESTUDIANTE");
    
        Doctor e= new Doctor ("default",0,0,"default");
        e.set_datospersonales();
        e.set_cadena();
        e.set_datonumerico();
        e.Mostrar();
    
        System.out.println("");
        System.out.println("");
        System.out.println("DEPORTISTAS");
        Deportista d= new Deportista("default",0,0,"default");
        d.set_datospersonales();
        d.set_cadena();
        d.set_datonumerico();
        d.Mostrar();
        
    
    }
    
}
