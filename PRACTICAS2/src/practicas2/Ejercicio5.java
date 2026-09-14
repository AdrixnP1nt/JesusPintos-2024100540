package practicas2;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int par1,par2, exaf, total, nota;
        System.out.println("Ingrese el nombre del alumno: ");
        nombre=entrada.next();
        do{
            System.out.println("Ingrese nota del  parcial 1 (0-25 pts): ");
            par1=entrada.nextInt();
            if(par1 < 0 || par1 > 25){
                System.out.println("La nota ingresada no es valida.");
            }
        }while (par1 < 0 || par1 > 25);
        do{
            System.out.println("Ingrese nota del parcial 2 (0- 25 pts): ");
            par2=entrada.nextInt();
            if(par2 < 0 || par2 > 25){
                System.out.println("La nota ingresada no es valida.");
            }
        }while(par2 < 0 || par2 > 25);
        if(par1 < 15 || par2 < 15){
            System.out.println(nombre + " - Sin derecho a examen final ");
        }else {
            do{
                System.out.println("Ingrese nota del Examen Final (0-50 pts): ");
                exaf=entrada.nextInt();
                if(exaf < 0 || exaf > 50){
                    System.out.println("La nota ingresada no es valida.");
                }
            }while(exaf < 0 || exaf > 50);
            if(exaf < 30 ){
                System.out.println(nombre+" - SE APLAZO, hule :(");
            }else{
                total = par1 + par2 + exaf;

                if(total <= 60){
                    nota = 1;
                }else if (total <= 70){
                    nota = 2;
                }else if (total <= 80){
                    nota = 3;
                }else if(total <= 90){
                    nota = 4;
                }else {
                    nota = 5;
                }
                if(nota == 1){
                    System.out.println(nombre+" - Se aplazo, hule :( ");
                }else{
                    System.out.println(nombre+" APROBO LA MATERIA :D");
                    System.out.println("Puntaje total: "+total);
                    System.out.println("Nota final: "+nota); 
                }
            }
        }
    }
}
