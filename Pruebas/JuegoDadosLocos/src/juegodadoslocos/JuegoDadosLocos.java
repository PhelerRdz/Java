package juegodadoslocos;

import java.util.Random;
import java.util.Scanner;

public class JuegoDadosLocos {
    public static void main(String[] args) throws InterruptedException {
        Random rnd = new Random();
        int dado1=rnd.nextInt(6);
        int dado2=rnd.nextInt(6);
        int numeroresult=dado1+dado2;
        if (numeroresult<7) {
            numeroresult=1;
        }else if (numeroresult==7) {
            numeroresult=2;
        }else{
            numeroresult=3;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos Jugadores jugaran: ");
        int cant=sc.nextInt();
        int[] apostado = new int [cant];
        int[] cantidad = new int [cant];
        int[] numero = new int [cant];
        int dinero;
        System.out.println("Digite la cantidad de Dinero que tendra cada uno de los Jugadores: ");
        System.out.println("1.- 10000(partida Rapida)");
        System.out.println("2.- 50000(partida Normal)");
        System.out.println("3.- 100000(partida Larga)");
        int opc=sc.nextInt();
        switch (opc) {
            case 1:
                dinero=10000;
                break;
            case 2:
                dinero=50000;
                break;
            case 3:
                dinero=100000;
                break;
            default:
                throw new AssertionError();
        }
        for (int i = 0; i < apostado.length; i++) {
            cantidad[i]=dinero;
        }
        for (int i = 0; i < apostado.length; i++) {
            System.out.println("Digite la cantidad de dinero que apostara el Jugador "+(i+1)+": ");
            apostado[i]=sc.nextInt();
            cantidad[i]-=apostado[i];
            System.out.println("Caso:");
            System.out.println("1.- Menor a 7");
            System.out.println("2.- Igual a 7");
            System.out.println("3.- Mayor a 7");
            System.out.println("Digite su opcion: ");
            numero[i]=sc.nextInt();
            if (numero[i]==numeroresult) {
                cantidad[i]+=apostado[i]*3;
            }
        }
        System.out.println("Lanzando Dado 1:......");
        Thread.sleep(1000);
        System.out.println("Numero del Dado 1: "+dado1);
        System.out.println("Lanzando Dado 2:......");
        Thread.sleep(1000);
        System.out.println("Numero del Dado 2: "+dado2);
        for (int j = 0; j < apostado.length; j++) {
                System.out.println("Resultados del jugardor:");
                System.out.println("Cantidad Actual: "+cantidad[j]);
            }
        
    }
}
