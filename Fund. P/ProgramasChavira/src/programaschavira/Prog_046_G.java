/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_046_g;
import java.util.Scanner;
/**
 *
 * @author MCJAVIER
 */
public class Prog_046_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner ps = new Scanner (System.in);
int i,num, cont=0;

        System.out.println("Ingrese numero");
        num=ps.nextInt();
        
        for(i=num;i>=1;i--){
        
            if (num%i==0){
            
                cont=cont+1;
            }
            
        }

        
        if(cont==2){
        
            System.out.println("El numero es primo");
            
        }else {
        
            System.out.println("No es numero primo");
        }

    }
    
}
