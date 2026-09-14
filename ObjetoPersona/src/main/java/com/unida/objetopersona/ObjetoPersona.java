package com.unida.objetopersona;

import java.util.Scanner;
/**
 *
 * @author laboratorioasu
 */
public class ObjetoPersona {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Persona ObjetoPersona = new Persona();
        
        System.out.println("Ingrese el nombre de la persona: ");
        ObjetoPersona.Nombre = entrada.next();
        System.out.println("Ingrese el apellido de la persona:");
        ObjetoPersona.Apellido = entrada.next();
        System.out.println("Ingrese su CI: ");
        ObjetoPersona.CI = entrada.next();
        System.out.println("Ingrese su direccion: ");
        ObjetoPersona.Direccion = entrada.next();
        System.out.println("Ingrese su edad: ");
        ObjetoPersona.Edad = entrada2.nextInt();
        
        ObjetoPersona.MostrarPersona();
         
    }
}
