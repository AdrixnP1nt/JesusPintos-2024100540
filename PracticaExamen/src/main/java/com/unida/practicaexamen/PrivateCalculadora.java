/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unida.practicaexamen;

/**
 *
 * @author AdrixnP1nt
 */
public class PrivateCalculadora {

    private int numero1;
    private int numero2;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int sumar() {
        return numero1 + numero2;
    }

    public int restar() {
        return numero1 - numero2;
    }

    public int div() {
        return numero1 / numero2;
    }

    public int multi() {
        return numero1 * numero2;
    }

}
