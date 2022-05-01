/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_014_g;
import java.util.Scanner;


/**
 *
 * @author MCJAVIER
 */
public class Prog_014_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ESTE ES EL PROG_015
        
Scanner ps = new Scanner(System.in);
int cant,b500,b200,b100,b50,b20,m10,m5,m2,falta;

System.out.print("Ingrese cantidad para pagar: ");

        cant=ps.nextInt();
        b500=cant/500;
        falta=cant -(b500*500);
        b200=falta/200;
        falta=falta-b200*200;
        b100=falta/100;
        falta=falta-(b100*100);
        b50=falta/50;
        falta=falta-(b50*50);
        b20=falta/20;
        falta=falta-b20*20;
        m10=falta/10;
        falta=falta-m10*10;
        m5=falta/5;
        falta=falta-m5*5;
        m2=falta/2;
        falta=falta-m2*2;
System.out.println ("Tienes tu paga en las siguientes denominaciones");        
System.out.println ("Billetes de 500: "+ b500);
System.out.println ("Billetes de 200: "+ b200);
System.out.println ("Billetes de 100: "+ b100);
System.out.println ("Billetes de 50: "+ b50);
System.out.println ("Billet de 20: "+ b20);
System.out.println ("monedas de 10: "+ m10);
System.out.println ("Monedas de 5: "+m5);
System.out.println ("Monedas de 2 "+m2);
System.out.println ("Monedas de 1: "+falta);


    }
    
}
