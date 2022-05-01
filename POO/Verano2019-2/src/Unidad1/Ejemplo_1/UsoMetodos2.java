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
public class UsoMetodos2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double n1, n2, n3;
        
        System.out.println("ingresa 3 números:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        
        //PARAMETRO: SON LAS VARIABLES QUE REQUIERE UN MÉTODO
        //ARGUMENTO: SON LOS VALORES ENVIADOS PARA LA EJECUCIÓN DEL MÉTODO
        System.out.println("El mayor es: " + MayorDe3(n1, n2, n3));
        
    }
    
        
    public static double MayorDe3(double a, double b, double c){
        /*        
        NOTA: DEBE EXISTIR UN RETURN PARA TODOS LOS CAMINOS 
                POSIBLES POR EL PROCEDMIENTO DENTRO DEL MÉTODO
        
                NO DEBE EXISTIR MÁS RETURNS QUE CAMINOS POSIBLES
        */
        
        if (a>b && a>c) {
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        /*
        else {
            //return c;
        }
        */
        
        return c;
    }
    
}
