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
public class Persona {
    public String nombre;
    public String apellido;
    public int edad;
    private static Persona elUnico;
    
    private Persona(){}
    private Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public static Persona getInstance(){
        if (elUnico == null){
            elUnico = new Persona();
        }
        return elUnico;
    }
    public static Persona getInstance(String nombre, String apellido, int edad){
        if (elUnico != null){
            elUnico = new Persona(nombre,apellido,edad);
        }
        return elUnico;
    }
    
    @Override
    public String toString(){
        return "La persona se llama: " + nombre + " " + apellido + " y tiene "+  edad + " años."; 
    }
}