/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_052_g;

import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class Prog_052_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner ps = new Scanner (System.in);

int ta, con=0,r=0,i;


        System.out.println("Ingresa una tabla: ");
        ta=ps.nextInt();
        
        for (i=1;i<=10;i++){
        
            do{
               
                System.out.println(ta+"*"+i+"= ");
                r=ps.nextInt();
                if(ta*i!=r){
                         con++;
                         }
            }while(r!=ta*i);
           
        
        }
        
        
        System.out.println("Errores "+con);
        
        
        
    }
    
}
