/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_012_g;
import java.util.Scanner;


/**
 *
 * @author MCJAVIER
 */
public class Prog_012_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calcular el are de un pentagono
Scanner ps = new Scanner(System.in);
double lado,apotema,area;

System.out.println ("Calcular el area de un pentagono\n");
System.out.println ("Ingrese el valor de uno de los lados del pentagono");
lado=ps.nextDouble();
System.out.println ("Ingrese el apotema del pentagono");
apotema = ps.nextDouble();
area = (lado*apotema/2)*5;
System.out.println ("El area del penagono es =" + area );


    }
    
}
