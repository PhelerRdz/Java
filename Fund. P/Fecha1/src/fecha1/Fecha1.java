/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha1;

import java.util.Scanner;

/**
 *
 * @author Pheler
 */
public class Fecha1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dia");
        int dia=sc.nextInt();
        int result=(dia-((((dia-1)/7)+1)*7))+7;
        System.out.println(result);
    }
    
}
