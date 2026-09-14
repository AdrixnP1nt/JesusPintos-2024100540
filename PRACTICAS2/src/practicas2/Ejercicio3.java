
package practicas2;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        int edad;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la edad de 20 personas.");
        for(int i = 1; i <= 20; i++){
            System.out.println("persona numero " + i +": ");
            edad=entrada.nextInt();
            
            if(edad >= 1 && edad <= 11){
                System.out.println("Ninio/a");
            }else if(edad >= 12 && edad <= 17){
                System.out.println("Adolescente");
            }else if (edad >= 18 && edad <= 30){
                System.out.println("Joven");
            }else if(edad >= 31 && edad <=49){
                System.out.println("Adulto");
            }else if(edad >= 50){
                System.out.println("Adulto mayor");
            }else{
                System.out.println("Edad no valida");
            }
        }
    }
}
