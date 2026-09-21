package com.unida.tarea7_cajero;

/**
 *
 * @author laboratorioasu
 */
import java.util.Scanner;

public class Tarea7_Cajero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        double MontoActual = 500000, Resultado, MontoRetiro = 0;
        int opcion = 1, rep = 0;
        boolean error = false;

        do {
            System.out.println("""
                               --- CAJERO MALOBAN ---
                               1- Ver Saldo.
                               2- Depositar Dinero.
                               3- Retirar Dinero.
                               4- Salir.
                               5- Repetir Proceso.
                               """);
            System.out.println("Ingrese un valor: ");
            opcion = entrada2.nextInt();
            switch (opcion) {
                case 1:
                    Resultado = MontoActual;
                    System.out.println("El monto actual de su cuenta es: " + Resultado + "$");
                    break;
                case 2:
                    System.out.println("Ingrese el monto que desea ingresar: ");
                    double MontoIngreso = entrada.nextDouble();
                    Resultado = MontoActual + MontoIngreso;
                    System.out.println("El nuevo saldo de su cuenta es: " + Resultado + "$");
                    break;
                case 3:
                    System.out.println("Ingresa el monto que desea retirar: ");
                    MontoRetiro = entrada.nextDouble();
                    do {
                        if (MontoRetiro > MontoActual) {
                            System.out.println("No cuenta con esa cantidad de saldo.");
                            error = true;
                        } else {
                            Resultado = MontoRetiro - MontoActual;
                            System.out.println("El nuevo saldo de su cuenta es: " + Resultado);
                            break;
                        }
                    } while (error != true);
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion Invalida.");
                    break;

            }
            if(opcion != 0){
                System.out.println("""
                               Desea Ingresar nuevos valores?
                                1- Si.
                                2- No.
                               """);
            rep = entrada2.nextInt();
            }else{
                break;
            }

        } while (rep == 1);
        entrada.close();
       
    }
}
