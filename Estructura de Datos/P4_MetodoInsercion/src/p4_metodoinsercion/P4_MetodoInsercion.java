package p4_metodoinsercion;

import java.util.Scanner;

public class P4_MetodoInsercion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, aux, j, pos;
        System.out.println("\nIngrese Numero de Datos a Ingresar : ");
        int tam = sc.nextInt();
        int array[] = new int[tam];
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print("Elemento " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
        System.out.println("Como quieres mostrar el arr:");
        System.out.println("1.- Ascendente");
        System.out.println("2.- Descendente");
        int var = sc.nextInt();
        switch (var) {
            case 1:
                for (int i = 0; i < array.length; i++) {
                    aux = array[i];
                    while ((i > 0) && (array[i - 1] > aux)) {
                        array[i] = array[i - 1];
                        i--;
                    }
                    array[i] = aux;
                }
                break;
            case 2:
                for (int i = 0; i < array.length; i++) {
                    aux = array[i];
                    while ((i > 0) && (array[i - 1] < aux)) {
                        array[i] = array[i - 1];
                        i--;
                    }
                    array[i] = aux;
                }
                break;
            default:
                System.out.println("Valor no valido....");
        }
        System.out.println("Lista Ordena");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " - ");
        }
        System.out.println(array[array.length - 1]);
    }

}
