
package test;

import java.util.Scanner;


public class ConvertirDatos {
    
    static Scanner ent = new Scanner(System.in);
    
    public static void main(String[] args) {
        /*String numeroString;
        System.out.print("Introduzca un número: ");
        numeroString = ent.nextLine();
        int numero = Integer.parseInt(numeroString);
        System.out.println("El numero introducido es: " + numero);*/
        
        FormaSantiagoINT();
    }
    
    public static void FormaSantiagoINT(){//correcion de pasar STRING A INT
        System.out.println("");
        System.out.print("Introudzca un número entero que quieras visualizar:  ");
        int entero = Integer.parseInt(ent.nextLine());
        System.out.println("El entero que se ha declarado es: " + entero);
    }
    //hacer programa donde decir si un alumno esta suspenso o aprobado
    
}
 