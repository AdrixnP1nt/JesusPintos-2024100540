package com.unida.clase3;
/**
 *
 * @author AdrixnP1nt
 */
public class Clase3 {
   
    //definicion de variables globales.
    int numero;
    double precio;
    String nombre;
    
    public static void main(String[] args) {
        //definicion de variables locales
        int edad = 25;
        boolean esMayor = true;
        
        //variables locales
        System.out.println("Edad: " + edad);
        System.out.println("Es mayor: " + esMayor);
        
        //Creacion de objeto para el uso de las variables globales.
        Clase3 ObjetoClase3 = new Clase3();
        
        ObjetoClase3.nombre = "Jesus";
        ObjetoClase3.numero = 23;
        ObjetoClase3.precio = 3.5;
        
        //variables globales
        System.out.println("Nombre: " + ObjetoClase3.nombre);
        System.out.println("Numero: " + ObjetoClase3.numero);
        System.out.println("Precio: "+ ObjetoClase3.precio);
        
    }
}
