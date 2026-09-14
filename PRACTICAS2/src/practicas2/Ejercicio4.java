
package practicas2;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, nombreMayor = "", nombreMenor = "";
        int edad, edadMayor=0, edadMenor=0;
        System.out.println("Ingrese el nombre de 5 personas.");
        for(int i=1; i <= 5; i++){
            System.out.println("Persona numero " + i +": ");
            nombre = entrada.next();
            System.out.println("Ingrese la edad: ");
            edad = entrada.nextInt();
            if (i == 1){
                edadMayor = edad;
                edadMenor = edad;
                nombreMayor = nombre;
                nombreMenor = nombre;
            }else{
                if(edad > edadMayor){
                    edadMayor = edad;
                    nombreMayor = nombre;
                }
                if (edad < edadMenor){
                    edadMenor = edad;
                    nombreMenor = nombre;
                }
            }
        }
        System.out.println("El mayor es: "+nombreMayor);
        System.out.println("El menor es: "+nombreMenor);
    }
}
