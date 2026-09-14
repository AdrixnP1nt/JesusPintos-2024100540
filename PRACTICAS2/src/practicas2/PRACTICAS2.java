
package practicas2;

import java.util.Scanner;

public class PRACTICAS2 {

    public static void main(String[] args) {
     
        int edad, salario;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println(" Ingrese su edad: ");
        edad=entrada.nextInt();
        
        if (edad < 16){
            System.out.println("NO PUEDE TRABAJAR");
        
        }else{
            System.out.println("Ingrese su salario: ");
            salario=entrada.nextInt();
        }
        
        
    }
}
