/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_019_g;

import java.util.Scanner;


/**
 *
 * @author MCJAVIER
 */
public class Prog_019_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner ps = new Scanner(System.in);
int num;

System.out.println ("Ingrese un numero");
num=ps.nextInt();
    if(num % 2==0){
        System.out.println ("El umero es par");
    } else {
        System.out.println ("El numero es impar");
    }


    }
    
}
