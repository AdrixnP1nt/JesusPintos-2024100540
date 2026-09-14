package com.unida.coche;

/**
 *
 * @author laboratorioasu
 */
public class Coche {
   private String marca;
   private String modelo;
   private int año;

    public Coche(){
     this.marca = "Desconocido";
     this.modelo = "Desconocido";
     this.año = 2000;
    }
    public Coche(String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }



}