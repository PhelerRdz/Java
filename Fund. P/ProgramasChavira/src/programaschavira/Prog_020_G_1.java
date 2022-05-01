/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_020_g;
import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class Prog_020_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner ps=new Scanner(System.in);
int pnum, snum;

System.out.println ("Ingrrese dos numeros");
System.out.println ("Ingrese primer numero");
pnum=ps.nextInt();
System.out.println ("Ingrese segundo numero");
snum=ps.nextInt();

    if (pnum>snum) {
        System.out.println ("El numero mayor es "+pnum);
        }
    else {
        System.out.println ("El numero  mas grande es "+snum);
    }
    

      

    }
    
}
