
package practicas2;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        int edades;
        int mayores = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 1; i <= 15; i++){
            System.out.println("Ingrese la edad de la persona " + i +": ");
            edades=entrada.nextInt();
            
            if (edades > 18){
               mayores++; 
            }
        }
        System.out.println("La cantidad de peronas mayores es: " +mayores);
    }    
}
