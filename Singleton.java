/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author clagosuarez
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona primeraPersona;
        primeraPersona = Persona.getInstance();
        primeraPersona = Persona.getInstance("Carlos", "Lago", 19);
        System.out.println(primeraPersona.toString());
        
        Persona segundaPersona;
        segundaPersona = Persona.getInstance();
        System.out.println(segundaPersona.toString());
        System.out.println(primeraPersona.toString());
    }
    
}
