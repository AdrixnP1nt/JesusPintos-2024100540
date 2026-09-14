package com.unida.codigosclase;

/**
 *
 * @author laboratorioasu
 */
public class settergetter {
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public static void main(String[] args) {
        settergetter hw = new settergetter();
        hw.setEdad(1);
        System.out.println("Hola Mundo: " +  hw.getEdad());
    }

}
