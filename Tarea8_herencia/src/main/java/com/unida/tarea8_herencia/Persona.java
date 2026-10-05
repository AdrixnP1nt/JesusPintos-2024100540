package com.unida.tarea8_herencia;

/**
 *
 * @author laboratorioasu
 */
public class Persona {
    protected String nombre;
    protected String cedula;
    protected String apellido;
    protected String celular;
    
    public Persona(){
        this.nombre = "Null";
        this.cedula = "Null";
        this.apellido = "Null";

        this.celular = "Null";
    }
    public Persona (String nombre,String apellido, String cedula, String celular){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.celular = celular;
    }
    @Override
    public String toString(){
        return  "Nombre: " + nombre + "\nApellido: " + apellido + "\nCedula:  " + cedula + "\nCelular: " + celular;
    }
    
}
