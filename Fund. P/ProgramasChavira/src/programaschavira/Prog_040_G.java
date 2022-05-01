/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_040_g;
import java.util.Scanner;
/**
 *
 * @author MCJAVIER
 */
public class Prog_040_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Scanner ps = new Scanner (System.in);
int tab;
System.out.println ("¿Que tabla quieres imprimir?");
tab=ps.nextInt();

int r;
for (r=1; r<=10;r++){

    System.out.println(tab+"*"+r+" = "+tab*r);
    
}


    }
    
}
