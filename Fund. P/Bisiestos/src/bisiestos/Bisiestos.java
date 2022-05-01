package bisiestos;

import java.util.Scanner;

public class Bisiestos {

    public static void main(String[] args) {
        Scanner stv = new Scanner(System.in);
        int M = 0;
        System.out.print("Dia: ");
        int dia = stv.nextInt();
        System.out.print("Mes: ");
        int mes = stv.nextInt();
        System.out.print("Año: ");
        int año = stv.nextInt();
        
        int residuo = ((año - 1) % 7 + ((año - 1) / 4 - (3 * ((año - 1) / 100 + 1) / 4)) % 7 + M + dia % 7) % 7;
        switch (residuo) {
            case 0:
                System.out.println("Domingo");
                break;
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            default:
                throw new AssertionError();
        }
    }
}