/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6herencia;

import ico.fes.individuos.Alumno;

/**
 *
 * @author Personal
 */
public class Tarea6Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno("318125486", "ICO", 3, "Angel", 19, 1, 1.75f);
        System.out.println( alu1.toString() );
        System.out.println("Altura del alumno: "+ alu1.getAltura());
        
        
        
    }
    
}
