package com.unida.clasepersona;
/**
 *
 * @author AdrixnP1nt
 */
public class Persona {
    String Nombre;
    String Apellido;
    int Edad;
    String CI; //en el hipotetico caso de que una cedula de identidad tenga algun caracter XD
    String Direccion;
    
    public void MostrarInfoPersona(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido: " + Apellido);
        System.out.println("Cedula de Identidad: " + CI);
        System.out.println("Edad: " + Edad);
        System.out.println("Direccion: " + Direccion);
    }
}
