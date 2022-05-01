/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_009_g;
import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class Prog_009_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner ps = new Scanner(System.in);
double radio,altura,area, volumen;

System.out.println ("\t\t VOLUMEN DE UN CILINDRO \n");
System.out.println ("DAME EL RADIO DE LA BASE");
radio = ps.nextDouble();
System.out.println ("DAM LA ALTURA DEL CILINDRO");
altura=ps.nextDouble();
area = 3.14159265 * Math.pow (radio,2);
volumen = area * altura;

System.out.println ("EL VOLUMEN ES = " + volumen);





    }
    
}
