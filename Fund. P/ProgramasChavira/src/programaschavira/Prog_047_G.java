/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_047_g;

import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class Prog_047_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner ps = new Scanner (System.in);
int num, i=0,cont=0;
        System.out.println("Ingrese numero");
        num=ps.nextInt();
        
        for (i=2;i<num;i++){
        
        if(num%i==0){
            cont++;
        
        }
        
        }
        
        if(cont==0){
            System.out.println("Es primo");
        
        }else {
        
            System.out.println("No es primo");
        }
        


    }
    
}
