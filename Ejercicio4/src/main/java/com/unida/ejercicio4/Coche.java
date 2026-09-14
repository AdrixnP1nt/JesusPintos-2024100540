package com.unida.ejercicio4;

/**
 *
 * @author Laboratorio
 */
public class Coche {
    private String Marca;
    private String Modelo;
    private int Año;
    
    public Coche(){
        this.Marca = "Deconocido";
        this.Modelo = "Desconocido";
        this.Año = 2000;
    }
    
    public Coche(String Marca, String Modelo, int Año){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Año = Año;
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
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }
    
    public void MostrarCoche(){
        System.out.println("Marca: " + Marca + "\nModelo: " + Modelo + "\nAño: " + Año);
    }
    public void MostrarCoche(String tipoInfo){
        if(tipoInfo.equals("Marca")){
            System.out.println("Marca: " + Marca);
        }else if(tipoInfo.equals("marca")){
            System.out.println("Marca: " + Marca);
        }else if(tipoInfo.equals("Modelo")){
            System.out.println("Modelo: " + Modelo);
        }else if(tipoInfo.equals("modelo")){
            System.out.println("Modelo: " + Modelo);
        }else if(tipoInfo.equals("Año")){
            System.out.println("Año: " + Año);
        }else if(tipoInfo.equals("año")){
            System.out.println("Año: " + Año);
        }
        
    }
    
    
}
