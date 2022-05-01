package prog_11;

import java.util.Scanner;

public class Prog_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c, f, cont = 0;
        System.out.println("COLUMNAS: ");
        c = sc.nextInt();
        System.out.println("FILAS");
        f = sc.nextInt();
        int[][] matriz = new int[c][f];
        for (int C = 0; C < c; C++) {
            for (int F = 0; F < f; F++) {
                System.out.println("Dame el valor columna " + C + " fila " + F);
                matriz[C][F] = sc.nextInt();
            }
        }
        int[][] matriz2 = new int[c][f];
       
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < f; j++) {
                cont = 0;
                for (int x = -1; x <= 1; x++) {
                    for (int y = -1; y <= 1; y++) {
                        if (((i + x >= 0) && (j + y >= 0)) && ((i + x < c) && (j + y < f))) {
                            if (matriz[i][j] == matriz[i + x][j + y]) {
                                cont++;
                            }
                        }
                    }
                    matriz2[i][j] = cont - 1;
                }
            }
        }
        System.out.println("-");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < f; j++) {
                System.out.print("[" + matriz2[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
