/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_044_g;
import java.util.Scanner;
/**
 *
 * @author MCJAVIER
 */
public class Prog_044_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner ps = new Scanner (System.in);
    int valor, men;
    
        System.out.println("Damw valor 1");
        valor=ps.nextInt();
        
        men=valor;
        int x;
        for(x=2;x<=1000;x++){
        
            System.out.println("Dame valor "+x);
            valor=ps.nextInt();
            if(valor<men){
            
            men=valor;
            
            }
            
        }
        
        System.out.println("El valor menor es: "+x);
        
    }
    
}
