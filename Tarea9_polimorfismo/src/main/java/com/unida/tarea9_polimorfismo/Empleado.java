package com.unida.tarea9_polimorfismo;

/**
 *
 * @author pintos
 */
public abstract class Empleado {
    protected String nombre;
    
    public Empleado (String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public abstract double calcularSueldo();
}
