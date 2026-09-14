package com.unida.clasepersona;
/**
 *
 * @author AdrixnP1nt
 */
public class ClasePersona {

    public static void main(String[] args) {
        Persona ObjetoPersona = new Persona();

        ObjetoPersona.Nombre = "Jesus";
        ObjetoPersona.Apellido = "Pintos";
        ObjetoPersona.CI = "M-6002314";
        ObjetoPersona.Edad = 21;
        ObjetoPersona.Direccion = "Mariano Roque Alonso";
        ObjetoPersona.MostrarInfoPersona();
    }
}
