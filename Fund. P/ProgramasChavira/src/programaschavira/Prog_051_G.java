/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_051_g;

import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class Prog_051_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner ps=new Scanner (System.in);

int num=0,con=0;


while(con<2){

    System.out.println("Ingresa numero: ");
    num=ps.nextInt();
    
    if (num<0){
    
    con++;
    }else {
        con=0;
    
    }

}


    }
    
}
