/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_024_g;
import java.util.Scanner;
import java.math.MathContext;


/**
 *
 * @author MCJAVIER
 */
public class Prog_024_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b,c;
Scanner ps =new Scanner(System.in);
        System.out.println("Ingrese 3 numeros");
        a=ps.nextDouble();
        System.out.println("Numero 2");
        b=ps.nextDouble();
        System.out.println("Numero 3");
        c=ps.nextDouble();
        
        
        if (a>b){
        if (b>c){      
            System.out.println(a+","+b+","+c);}
        else  if (a>c){System.out.println(a+","+c+","+b);} else  {
                System.out.println(c+","+a+","+b);
            }
        } else {
            if (a>c){
                System.out.println(b+","+a+","+c);
            } else {
                if  (b>c){
                    System.out.println(b+","+c+","+a);} else {
                    System.out.println(c+","+b+","+a);
                }
            }
        
        }
        
    }
    
}
