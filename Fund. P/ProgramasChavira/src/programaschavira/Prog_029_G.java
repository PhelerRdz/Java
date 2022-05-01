/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_029_g;
import java.util.Scanner;
/**
 *
 * @author MCJAVIER
 */
public class Prog_029_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int num;

Scanner ps=new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 9999: ");
        num=ps.nextInt();
        System.out.print ("Tiene ");
        if (num<10){
            System.out.println("un digito");
        }else {
            
        }if (num<100){
            System.out.println("dos digitos");
        }else {
            if (num<1000){
                System.out.println("tres digitos");                
            }else {
                System.out.println("cuatro digitos");
            }
        }

    }
    
}
