package com.unida.ejercicio4;
/**
 *
 * @author AdrixnP1nt
 */
public class Coche {

    private String Marca;
    private String Modelo;
    private int año;

    public Coche() {
        this.Marca = "Desconocido";
        this.Modelo = "Desconocido";
        this.año = 2000;
    }

    public Coche(String Marca, String Modelo, int año) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.año = año;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    
    public void MostrarInfo(){
        System.out.println("Marca:  " + Marca + "\nModelo: " + Modelo + "\nAño: " + año);
    }
    public void MostrarInfo(String tipoInfo){
        if(tipoInfo.equals("marca")){
            System.out.println("Marca: " + Marca);
        }else if(tipoInfo.equals("Marca")){
            System.out.println("Marca: " + Marca);
        }
    }
}
