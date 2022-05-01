/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_043_g;
import java.util.Scanner;
/**
 *
 * @author MCJAVIER
 */
public class Prog_043_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner ps = new Scanner(System.in);
int valor, may;

        System.out.println("Dame el valor 1 ");
        valor=ps.nextInt();
        
        may=valor;
        int x;
        for(x=2;x<=1000;x++){
        
            System.out.println("Dam el valor "+x);
            valor=ps.nextInt();
            
            if(valor>may){
                may=valor;
                
            }
        }
        
        System.out.println("El valor mayor es: "+may);
        
        

    }
    
}
