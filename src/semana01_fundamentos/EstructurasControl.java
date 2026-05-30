package semana01_fundamentos;

import java.util.Scanner;

public class EstructurasControl {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // IF - ELSE
        System.out.println(" IF - ELSE ");
        System.out.print("Ingresa tu nota (0-100): ");
        int nota = sc.nextInt();
        
        if (nota >= 61) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
        
        // SWITCH
        System.out.println("\n SWITCH ");
        System.out.print("Ingresa un dia (1-7): ");
        int dia = sc.nextInt();
        
        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miercoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sabado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Dia invalido");
        }
        
        sc.close();
    }
}