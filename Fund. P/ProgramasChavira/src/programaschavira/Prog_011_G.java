/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_011_g;
import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class Prog_011_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se calculara el area de un trapecio;
Scanner ps = new Scanner(System.in);

double basemen,basemay,altura,area;

System.out.println ("Calcular el area de un trapecio  \n");
System.out.println ("Ingrese la base menor del trapecio");
basemen = ps.nextDouble();
System.out.println ("Ingrese la base mayor del trapecio");
basemay = ps.nextDouble();
System.out.println ("Ingrese la altura del trapecio");
altura = ps.nextDouble();
area = (basemen + basemay)*altura/2;
System.out.println ("El area del trapecio es = " + area);
    }
    
}
