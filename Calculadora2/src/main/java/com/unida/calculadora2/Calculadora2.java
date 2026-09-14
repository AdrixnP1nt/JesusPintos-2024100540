package com.unida.calculadora2;

/**
 *
 * @author laboratorioasu
 */
import java.util.Scanner;
import static com.unida.calculadora2.Calcu.*;

public class Calculadora2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, sumas, restas, multis, divs;



        System.out.println("Ingrese la opcion deseada."
                + "\nSuma: 1"
                + "\nResta: 2"
                + "\nMultiplicacion: 3"
                + "\nDivisino: 4");
        int opciones = entrada.nextInt();
        System.out.println("Ingrese los numeros a operar: ");
        a = entrada.nextInt();
        b = entrada.nextInt();

        switch (opciones) {
            case 1:
                sumas = Suma(a, b);
                System.out.println("La suma es: " + sumas);
                break;
            case 2:
                restas = resta(a, b);
                System.out.println("La resta es: " + restas);
                break;
            case 3:
                multis = multi(a, b);
                System.out.println("La multiplicacion es: " + multis);
                break;
            case 4:
                if (a == 0 || b == 0) {
                    System.out.println("no se puede divir por cero.");
                } else {
                    divs = div(a, b);
                    System.out.println("La division es: " + divs);
                }
                break;
            default:
                System.out.println("Opcion incorrecta.");
                break;
        }
    }
}
