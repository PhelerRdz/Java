/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_034_g;

import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class Prog_034_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner ps= new Scanner (System.in);

int d1,d2,d3,d4,num, may;

        System.out.println("Introduce numero de 4 digitos");
        num = ps.nextInt();
        d1=num/1000;
        d2=num%1000/100;
        d3=num%100/10;
        d4=num%10;
        may=d1;
        if (d2>may){
            may=d2;
        }
        if(d3>may){
            may=d3;
        }
        
        if(d4>may){
            may=d4;
        }
        
        System.out.println("Elmayor es "+may);
        
        
        
        
    }
    
}
