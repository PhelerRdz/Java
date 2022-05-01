/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_030_g;

import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class Prog_030_G {

    public static void main(String[] args) {

Scanner ps = new Scanner (System.in);
double  a,b,R,dec,resto;

int pd,pe;

        System.out.println("Introduce numero: ");
        a=ps.nextDouble();
        System.out.println("Introduce un segundo numero");
        b=ps.nextDouble();
        R=a/b;
        pe=(int)R;
        dec=R-pe;
        pd=(int)dec*10;
        resto=dec-pd/10;
        
        if (resto>0.05){
            pd=pd+1;
        
        }
        System.out.println(pe+"."+pd);
               

    }
    
}
