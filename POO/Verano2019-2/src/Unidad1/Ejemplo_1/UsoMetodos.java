/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad1.Ejemplo_1;

import java.util.Scanner;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class UsoMetodos {

    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Ingresa 5 Numeros:");        
        
        int n1, n2, numero3, n4, n5;
        
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        numero3 = sc.nextInt();
        n4 = sc.nextInt();
        n5 = sc.nextInt();
                
        int sum = Sum5Numbers(n1, n2, numero3, n4, n5);
        System.out.println(sum);
    }
    
    public static int Sum5Numbers(int n1, int n2,int n3, int n4, int n5){
                
        int sum;
        sum = n1 + n2 + n3 +n4 + n5;
        
        return sum;
        
    }
    
}

