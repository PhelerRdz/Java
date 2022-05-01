package javaapplication31;

import java.util.Scanner;

public class JavaApplication31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Hacer un despachador
        2369
        4 billetes de 500
        1 billete de 200
        1 billete de 100
        1 billete de 50
        1 moneda de 10
        1 moneda de 5
        2 monedas de 2
        
        
        Caso''500,200,100,50,20,10,5,2,1,.5,.2,.1
        */
        int b500,b200,b100,b50,m10,m5,m2,m1;
        double c5,c2,c1,cp,cc5,cc2,cc1;
        System.out.println("Cantidad a pagar");
        cp = sc.nextInt();
        b500=((int)(cp)/500);
        System.out.println(b500+" billete(s) de 500");
        cp=cp-b500*500;
        b200=((int)(cp)/200);
        System.out.println(b200+" billete(s) de 200");
        
        
    } 
  
}