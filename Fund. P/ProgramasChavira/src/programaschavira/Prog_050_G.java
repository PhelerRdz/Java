/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_050_g;

import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class Prog_050_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner ps = new Scanner (System.in);

int num=0,con=0, suma=0,prom=0,may=0, men=21474836;


while(num>0){

con++;
    System.out.println("Dame un numero ");
    num=ps.nextInt();
    suma=suma+num;
    
    if(num>may){
    
    may=num;
    
    }
    
    if (num<men){
        men=num;
    
    }

}

        System.out.println(con);
        prom=suma/con;
        System.out.println("El mayor es "+may);
        System.out.println("El menor es "+men);

    }
    
}
