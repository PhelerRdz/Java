/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_008_g;
import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class Prog_008_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
double base,altura,area;

Scanner ps = new Scanner(System.in);
System.out.println ("CALCULAR EL AREA DE UN RECTANGULO");
System.out.println (" DAME UNA BASE");
base=ps.nextDouble();
System.out.println ("DAM UNA ALTURA");
altura=ps.nextDouble();
area = base*altura;
System.out.println ("TU AREA ES  " + area);

    }
    
}
