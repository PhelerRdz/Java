package piñeiro;

import java.util.Scanner;

public class Piñeiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //rellenar datos iniciales
        System.out.println("Cuantos numeros de valores iniciales seran");
        double []arreglo=new double[sc.nextInt()];
        double[]result=new double[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Valor Inicial numero "+(i+1));
            arreglo[i]=sc.nextDouble();
        }
        //rellenar datos de la matriz
        System.out.println("Tamaño de la matriz");
        System.out.println("¿Cuantas columnas en la matriz quieres que haya?");
        int horizontal = sc.nextInt();
        double [][]matriz = new double [arreglo.length][horizontal];
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < horizontal; j++) {
                System.out.println("Dame el valor de la posicion "+i+","+j);
                matriz[i][j]=sc.nextDouble();
            }
        }
        //vueltas
        System.out.println("¿Cuantas vueltas quieres hacer?");
        int vueltas=sc.nextInt();
        for (int v = 0; v < vueltas; v++) {
            for (int j = 0; j < horizontal; j++) {
                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println("Vuelta "+v);
                    System.out.println("Matriz cordenadas "+j+","+i+" = "+matriz[j][i]);
                    System.out.println("arreglo "+i+" = "+arreglo[i]);
                    result[j]+=(matriz[j][i]*arreglo[i]);
                    System.out.println("resultado:  "+result[j]);
                    System.out.println("==========");
                }
                System.out.println(result[j]);
                System.out.println("============");
                //reemplazar
            }
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i]=result[i];
                result[i]=0;
            }
        }
    }
}
