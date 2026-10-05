package com.unida.tarea8_herencia;

/**
 *
 * @author laboratorioasu
 */
public class Estudiante extends Persona {
    private String matricula;
    private String carrera;
    private String materia;
   
    
    public Estudiante(String nombre, String apellido, String cedula, String matricula, String carrera, String materia, String celular){
        super(nombre, apellido, cedula, celular);
        this.matricula = matricula;
        this.carrera = carrera;
        this.materia = materia;
    }
    
    
    @Override
    public String toString(){
        return  super.toString() + "\nMatricula: " + matricula + " \nCarrera:  " + carrera + "\nMateria: " + materia ;
    }
}
