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
public class UsoMetodos3 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);        
        int numero;
        
        do{
            numero = sc.nextInt();
        }        
        while(IsPair(numero));
        
        System.out.println("Fin del Programa");
        
    }
    
    public static boolean IsPair(int n){
        /*
        if (n%2==0) {
            return true;
        }
        else {
            return false;
        }
        */
        
        return n%2==0; //true - false
        
    }
    
}
