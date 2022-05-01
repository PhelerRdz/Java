package investigacion.de.operaciones;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Tablas de multiplicar
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del "+i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+" * "+j+" = "+(i*j));
            }
        }
    }
}
