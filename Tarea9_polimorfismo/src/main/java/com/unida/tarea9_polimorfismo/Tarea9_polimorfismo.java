package com.unida.tarea9_polimorfismo;

/**
 *
 * @author pintos
 */
public class Tarea9_polimorfismo {

    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        
        empleados[0] = new EmpledoFijo("Jesus Pintos", 3500000.0);
        empleados[1] = new EmpleadoPorHora("Horacio Cartes", 120, 25000.0);
        empleados[2] = new EmpleadoPorHora("San Pedro", 80, 50000.0);
        
        System.out.println("SUELDO DE EMPLEADOS");
        for (Empleado emp : empleados){
            System.out.println("Empleado: " + emp.getNombre() + "\nSueldo: " + emp.calcularSueldo());
        }
    }
}
