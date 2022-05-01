/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_036_g;
import java.util.Scanner;
/**
 *
 * @author MCJAVIER
 */
public class Prog_036_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner ps=new Scanner(System.in);
int calif;
        System.out.println("Ingrese una calificacion");
calif=ps.nextInt();

        System.out.println("Sucalificacion es equivalente a");

if (calif<=5)   System.out.println("E");
else {
    if (calif==6) System.out.println("D");
    else {
        if (calif==7)   System.out.println("C");
        else {
            if (calif<10) System.out.println("B");
            else {
                System.out.println("A");
            }
        }      
    }
}
}
    
}
