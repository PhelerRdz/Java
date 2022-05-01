/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_023_g;
import java.math.MathContext;
import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class Prog_023_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double a,b,c,raiz,rr,rr2,pre,i;
        Scanner ps =new Scanner(System.in);
        
    
        System.out.println("Ingrese 1er  coeficiente");
        a=ps.nextDouble();
        System.out.println("Ingrese 2do coefciente");
        b=ps.nextDouble();
        System.out.println("Ingrese 3er coeficiente");
        c=ps.nextDouble();
        raiz=b*b-4*a*c;
        
        i=Math.sqrt(-1);
        System.out.println(i);
        
        
        if (raiz<0){
            i=Math.sqrt(raiz*-1)/(2*a);
            pre=-b/2*a;
            System.out.println("x1= "+pre+"+"+i+"    Raiz compleja");
            System.out.println("X2= "+pre+"-"+i+"    Raiz compleja");
         
        }else {
               rr=(-b + Math.sqrt(raiz))/(2*a);
            rr2=(-b - Math.sqrt(raiz))/(2*a);
            System.out.println("x1 = "+rr+ "   Es real");
            System.out.println("x2 = "+rr2+"   Es real");
        
        }
        
        
        
      
       
                
        
        









    }
    
}
