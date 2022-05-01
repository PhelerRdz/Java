package e2_ordenamientoinsercion;

import java.util.Scanner;

public class E2_OrdenamientoInsercion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese Numero de Datos a Ingresar : ");
        int tam = sc.nextInt();
        int aux,j;
        int array[] = new int[tam];
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print("Elemento " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }

        System.out.println("Como quieres mostrar el arreglo:");
        System.out.println("1.- Ascendente");
        System.out.println("2.- Descendente");
        int var = sc.nextInt();
        switch (var) {
            case 1:
                for (int p = 1; p < array.length; p++) {
                    aux = array[p];
                    j = p - 1;
                    while ((j >= 0) && (aux < array[j])) {
                        array[j + 1] = array[j];
                        j--;
                    }
                    array[j + 1] = aux;
                }
                break;
            case 2:
                for (int p = 1; p < array.length; p++) {
                    aux = array[p];
                    j = p - 1;
                    while ((j >= 0) && (aux > array[j])) {
                        array[j + 1] = array[j];
                        j--;
                    }
                    array[j + 1] = aux;
                }
                break;
            default:
                System.out.println("Valor no valido....");
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
    }

}
