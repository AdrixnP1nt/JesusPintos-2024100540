
package com.unida.calculadora;

/**
 *
 * @author AdrixnP1nt
 */
public class ContadorV1 {
    private static int contador=0;
    
    private static void incrementarContador(){
        contador++;
    }
    public static void main(String[] args) {
        ContadorV1.incrementarContador();
        System.out.println("Contador: "+ ContadorV1.contador);
    }
}
