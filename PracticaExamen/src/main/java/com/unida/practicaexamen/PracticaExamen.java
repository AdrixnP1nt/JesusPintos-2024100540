package com.unida.practicaexamen;

/**
 *
 * @author AdrixnP1nt
 */
import java.util.Scanner;

public class PracticaExamen {

    public static void main(String[] args) {
        int a, b;
        int opcion;

        Scanner Entrada = new Scanner(System.in);
        PrivateCalculadora Calcu = new PrivateCalculadora();
        System.out.println("""
                           -- CALCULADORA MENU --
                           1 - SUMAR.
                           2 - RESTAR.
                           3 - MULTIPLICAR
                           4 - DIVIDIR""");
        System.out.println("Ingrese la opcion que desee:");
        opcion = Entrada.nextInt();
        System.out.println("ingrese los dos numeros a operar:");
        a = Entrada.nextInt();
        b = Entrada.nextInt();
        
        switch (opcion) {
            case 1:
                Calcu.setNumero1(a);
                Calcu.setNumero2(b);
                int resultadosuma = Calcu.sumar();
                System.out.println("el resultado de la suma es: " + resultadosuma);
                break;
            case 2:
                Calcu.setNumero1(a);
                Calcu.setNumero2(b);
                int resultadoresta = Calcu.restar();
                System.out.println("El resultado de la resta es: " + resultadoresta);
                break;
            case 3:
                Calcu.setNumero1(a);
                Calcu.setNumero2(b);
                int resultadomulti = Calcu.multi();
                System.out.println("El resultado de la multi es: " + resultadomulti);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("No se puede dividir por 0. ");
                } else {
                    Calcu.setNumero1(a);
                    Calcu.setNumero2(b);
                    int resultadodiv = Calcu.div();
                    System.out.println("El resultado de la division es: " + resultadodiv);
                    break;
                }

            default:
                System.out.println("Opcion no valida");
                break;
        }

    }
}
