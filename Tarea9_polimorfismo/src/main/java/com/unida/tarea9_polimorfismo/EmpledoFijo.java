/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unida.tarea9_polimorfismo;

/**
 *
 * @author pintos
 */
public class EmpledoFijo extends Empleado {
    private double sueldoMensual;
    
    public EmpledoFijo(String nombre, double sueldoMensual){
        super(nombre);
        this.sueldoMensual = sueldoMensual;
    }
    
    @Override
    public double calcularSueldo(){
        return sueldoMensual;
    }
}
