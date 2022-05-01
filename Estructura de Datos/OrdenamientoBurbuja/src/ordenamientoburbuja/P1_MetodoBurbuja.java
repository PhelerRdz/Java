package ordenamientoburbuja;

import java.util.Random;
import java.util.Scanner;


public class P1_MetodoBurbuja {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese Numero de Datos a Ingresar : ");
        int tam = sc.nextInt();
        int arr[] = new int[tam];
        System.out.println();
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(5000001);
        }
        System.out.println("Como quieres mostrar el arreglo:");
        System.out.println("1.- Ascendente");
        System.out.println("2.- Descendente");
        int var = sc.nextInt();
        switch (var) {
            case 1:
                for (int i = 0; i < arr.length - 1; i++) {
                    for (j = 0; j < arr.length - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int tmp = arr[j + 1];
                            arr[j + 1] = arr[j];
                            arr[j] = tmp;
                        }
                    }
                }
                break;
            case 2:
                for (int i = 0; i < arr.length - 1; i++) {
                    for (j = 0; j < arr.length - 1; j++) {
                        if (arr[j] < arr[j + 1]) {
                            int tmp = arr[j + 1];
                            arr[j + 1] = arr[j];
                            arr[j] = tmp;
                        }
                    }
                }
                break;
            default:
                System.out.println("Valor no valido....");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\n");
        }
    }

}
