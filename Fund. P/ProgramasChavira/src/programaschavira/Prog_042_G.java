/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_042_g;
import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class Prog_042_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner ps = new Scanner (System.in);
int suma=0,prom, num;
int i;

for (i=1;i<=1000;i++){

    System.out.println("Dame valor "+i);
    num=ps.nextInt();
    
    suma=suma+num;
}

prom=suma/1000;
        System.out.println("Promedio es: "+prom);


    }
    
}
