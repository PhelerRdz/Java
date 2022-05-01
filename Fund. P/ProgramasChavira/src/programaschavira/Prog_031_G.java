/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_031_g;
import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class Prog_031_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int año;
Scanner ps = new Scanner(System.in);



        System.out.println("Ingrese un año :");
        año=ps.nextInt();
        
        if(año%4==0){
            if (año%100!=0){
                System.out.println("Es un año bisiesto");
            } else {
                if (año%400==0){
                    System.out.println("Es un año bisiesto");
                }else {
                    System.out.println("No es año bisiesto");
                }
            }
        }else {
            System.out.println("No es año bisiesto");
        }
    }
    
}
