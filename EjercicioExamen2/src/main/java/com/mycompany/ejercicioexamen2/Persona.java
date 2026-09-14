package com.mycompany.ejercicioexamen2;

/**
 *
 * @author JesusPintos
 */
public class Persona {

    private String nombre;
    private int edad;
    
    //en el examen el codigo no cuenta con ningun constructor.
    public Persona(){
        this.nombre = "desconocido";
        this.edad = 0;
    }
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //el error aqui es que el tipo de dato que recibe esta definido como "int" teniendo que ser String ya que asi se definio arriba.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //y aqui en el tipo de dato que devuelve la funcion es "int" teniendo que ser String.
    public String getNombre() {
        return nombre;
    }
    
    //mismo error esta definido el dato de llegada que debe ser un String, pero edad esta definido como "int".
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //el error aqui se mantiene teniendo que ser int el tipo de dato que devuelve el getter, teniendo String.
    public int getEdad() {
        return edad;
    }
    

    

}
