/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_018_g;
import java.util.Scanner;


/**
 *
 * @author MCJAVIER
 */
public class Prog_018_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner ps = new Scanner(System.in);
double  c1,c2,c3,prom;

System.out.println ("Dame la 1er calificacion ");
c1=ps.nextDouble();
System.out.println ("Dame la 2da calificacion ");
c2=ps.nextDouble();
System.out.println ("Dame la 3er calificacion ");
c3=ps.nextDouble();
prom = (c1+c2+c3)/3;

    if (prom>7){
    System.out.println ("Aprobado");
        } 
    else {System.out.println ("Reprobado");
        }




    }
    
}
