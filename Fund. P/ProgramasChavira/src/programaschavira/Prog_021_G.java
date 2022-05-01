/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_021_g;
import java.util.Scanner;


/**
 *
 * @author MCJAVIER
 */
public class Prog_021_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner ps =new Scanner(System.in);
int num,num2;
System.out.println ("Ingrese un nummero");
        num=ps.nextInt();
System.out.println ("Ingrese segundo numero");
        num2=ps.nextInt();
System.out.println ("El orden sera ");
    if (num>num2){
        System.out.println (num+","+ num2); 
    }
    else {
        System.out.println (num2+", "+num);
    }
    

    }
    
}
