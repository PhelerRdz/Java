package tablero.de.robots;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Robot matriz[][] = new Robot[1][1];
        int n[] = new int[5];
        Tablero at = new Tablero();
        at.InsertarRobot(matriz);
    }
}
