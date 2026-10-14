package com.unida.tarea9_polimorfismo;

/**
 *
 * @author pintos
 */
public class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;
    private double valorPorHora;
    
    public EmpleadoPorHora (String nombre, int horasTrabajadas, double valorPorHora){
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }
    
    @Override
    public double calcularSueldo(){
        return horasTrabajadas * valorPorHora;
    }
    
}
