package com.unida.ejercicio4;

/**
 *
 * @author AdrixnP1nt
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Coche Coche1 = new Coche();
        System.out.println("Parametros Vacios.");
        Coche1.MostrarInfo();
        Coche1.MostrarInfo("Marca:");
        
        System.out.println("\nParametros cargados.");
        Coche Coche2 = new Coche("Lamborghini", "Veneno", 2013);
        Coche2.MostrarInfo();
        System.out.println("\nSolo la marca.");
        Coche2.MostrarInfo("Marca");
    }
}