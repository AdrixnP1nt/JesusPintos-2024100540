package com.unida.calculadora;

/**
 *
 * @author laboratorioasu
 */
public class Calculadora {
    public int sumar(int a, int b){
        return a + b;
    }
    public int sumar(int a, int b, int c){
        return a + b + c;
    }
    public double sumar (double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println("Suma de dos enteros: " + calc.sumar(1,3));
        System.out.println("Suma de tres enteros: " + calc.sumar(5, 3, 1));
        System.out.println("Suma de dos doubles: " + calc.sumar(12.4, 123.4));
    }
}
