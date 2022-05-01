/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_033_g;

import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class Prog_033_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner ps= new Scanner (System.in);

int d1, d2,d3,d4,num,van;


        System.out.println("Introduccir numero de 4 digitos");
        num=ps.nextInt();
        
        d1=num/1000;
        d2=num%1000/100;
        d3=num%100/10;
        d4=num%10;
        
        van=1;
        if (d1==d2){van=van+1;
        }
        if (d1==d3){
            van=van+1;
        }
        if (d1==d4){
                van=van+1;
        }
           
        System.out.println("digito "+d1+" se repite "+van+" veces");
        

    }
    
}
