/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_032_g;
import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class Prog_032_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ingresar una hora en formato 24 hrs e imprimirla en formato 12 hrs
Scanner ps = new Scanner(System.in);
    int hora;
        System.out.print ("Dame una hora: "); 
    hora=ps.nextInt();
    
    if (hora>12){
        System.out.println(hora-12 +" pm");
    } else {
        System.out.println(hora+" am");
        }
    }
    
}
