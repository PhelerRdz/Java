/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_048_g;

import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class Prog_048_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner ps = new Scanner (System.in);

int tab,r=0;

        System.out.print ("Ingrese tabla: ");
        tab=ps.nextInt();
        
        do{
            r=r+1;
            System.out.println(tab+"*"+r+"="+tab*r);
                    
        
        } while (r<10);



    }
    
}
