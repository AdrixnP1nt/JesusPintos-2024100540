package com.mycompany.ejercicioexamen2;

/**
 *
 * @author JesusPintos
 */
public class EjercicioExamen2 {

    public static void main(String[] args) {
        Persona persona2 = new Persona();
        
        //aqui usa el "get" para settear un nombre.
        persona2.setNombre("Juan");
        persona2.setEdad(25);
        
        //aqui usa el set para obtener el nombre de la persona.
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: " + persona2.getEdad());
    }
}
