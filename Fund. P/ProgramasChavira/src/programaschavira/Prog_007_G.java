/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_007_g;
import java.util.Scanner;


/**
 *
 * @author MCJAVIER
 */
public class Prog_007_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner ps = new Scanner(System.in);
    double base;
double altura;

System.out.println ("Dame el valor la base");
base=ps.nextInt();
System.out.println ("Dame una altura");
altura=ps.nextInt();
double area =base*altura/2;
System.out.println ("El area del traingulo es  "+ area);

    
    }
    
}
