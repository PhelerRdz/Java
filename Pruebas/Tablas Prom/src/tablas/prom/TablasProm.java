package tablas.prom;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

public class TablasProm {

    public static void main(String[] args) {
        Random rnd = new Random();
        int numero, tmp;
        int[][] vecesnumero = new int[54][2];
        for (int i = 0; i < vecesnumero.length; i++) {
            vecesnumero[i][0] = (i + 1);
            vecesnumero[i][1] = 0;
        }
        for (int i = 0; i < 9000; i++) {
            numero = (rnd.nextInt(54) + 1);
            vecesnumero[numero - 1][1]++;
        }
        for (int i = 0; i < vecesnumero.length - 1; i++) {
            for (int j = 0; j < vecesnumero.length - 1; j++) {
                if (vecesnumero[j][1] < vecesnumero[j + 1][1]) {
                    tmp = vecesnumero[j + 1][1];
                    vecesnumero[j + 1][1] = vecesnumero[j][1];
                    vecesnumero[j][1] = tmp;
                    tmp = vecesnumero[j + 1][0];
                    vecesnumero[j + 1][0] = vecesnumero[j][0];
                    vecesnumero[j][0] = tmp;
                }
            }
        }
        for (int i = 0; i < vecesnumero.length; i++) {
            System.out.println(vecesnumero[i][0]+": "+vecesnumero[i][1]);
        }
    }
}
