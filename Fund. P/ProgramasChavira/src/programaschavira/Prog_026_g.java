/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_026_g;

import java.util.Scanner;


public class Prog_026_g {

    public static void main(String[] args) {

 int a,b,c,aux;
Scanner ps =new Scanner(System.in);
        System.out.println("Ingrese 3 numeros");
        a=ps.nextInt();
        System.out.println("Numero 2");
        b=ps.nextInt();
        System.out.println("Numero 3");
        c=ps.nextInt();

        if (a>b){
        if (b>c){      
           
        if (a>c){
            
            aux=b;
            b=c;
            c=aux;
            } else  {
                aux=a;
                a=c;
                c=b;
                b=aux;
            }
        } else {
            if (a>c){
                aux=a;
                a=b;
                b=aux;
                
            } else {
                if  (b>c){
                    aux=a;
                    a=b;
                    b=c;
                    c=aux;
                } else {
                    aux=a;
                    a=c;
                    c=aux;
                }
            }
        
        }
        
            System.out.println(a+","+b+","+c);
    }
    
}
}
