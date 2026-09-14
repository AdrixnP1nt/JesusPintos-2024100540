package com.unida.appcalculadora;
/**
 *
 * @author AdrixnP1nt
 */
import  java.util.Scanner;
import static com.unida.appcalculadora.Calculadora.*;

public class AppCalculadora {

    public static void main(String[] args) {
        int a, b, ResultadoDiv=0;
        Scanner entrada = new Scanner(System.in);
        
        //entrada del primer valor
        System.out.println("Ingrese el primer valor.");
        a = entrada.nextInt();
        //entrada del segundo valor
        System.out.println("Ingrese el segundo valor.");
        b = entrada.nextInt();

        int ResultadoMulti = Multiplicacion(a,b);
        if (a == 0 || b == 0){
            System.out.println("No se puede dividir por 0.");
        }else{
            ResultadoDiv = Division(a,b);
        }
        int ResultadoSuma = Sumar(a, b);
        int ResultadoResta = Restar(a, b);
        System.out.println("Resultado de la Multiplicacion: " + ResultadoMulti);
        System.out.println("Resultado de la suma: " + ResultadoSuma);
        System.out.println("Resultado de la resta: " + ResultadoResta);
        System.out.println("Resultado de la division: " + ResultadoDiv);
    }
}