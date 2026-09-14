package com.unida.holamundo;

/**
 *
 * @author AdrixnP1nt
 */
public class Holamundo {
    public static int contador=0;
        
    public static void incrementarContador(){
       contador++;
    }
    public static void main(String[] args) {
        Holamundo.incrementarContador();
        System.out.println("Contador: " + Holamundo.contador);
    }
  
}
