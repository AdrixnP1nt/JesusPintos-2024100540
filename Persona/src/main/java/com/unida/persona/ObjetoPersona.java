package com.unida.persona;

/**
 *
 * @author laboratorioasu
 */
public class ObjetoPersona {
    String Nombre;
    String Apellido;
    int Edad;
    String CI;
    String Direccion;
    public void MostrarInfoPersona(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido: " + Apellido);
        System.out.println("Edad: " + Edad);
        System.out.println("CI: " + CI);
        System.out.println("Direccion: " + Direccion);
    }
}
