/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_037b_g;

import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class Prog_037B_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner ps=new Scanner (System.in);
int mes, dia,dr=0,hecho;
        System.out.println("Ingrese mes : ");
        mes=ps.nextInt();
        System.out.println("Ingrese dia : ");
        dia=ps.nextInt();
        
        switch (mes){
            case 1:
            case 10:
                    dr=dia;
                    break;
                    
            case 2:
            case 3:
            case 11:
                    dr=dia+3;
                    break;
                    
            case 4:
            case 7:
                    dr=dia+6;
                    break;
                    
            case 5:
                    dr=dia+1;
                    break;
                    
            case 6:
                    dr=dia+4;
                    break;
                    
            case 8:
                    dr=dia+2;
                    break;
                    
            case 9:
            case 12:
                    dr=dia+5;
                    break;
                            
        }
        
        switch (dr){
            case 0:
                    System.out.println("Domingo");
                    break;
            case 1:
                    System.out.println("Lunes");
                    break;
            case 2:
                    System.out.println("Martes");
                    break;
            case 3:
                    System.out.println("Miercoles");
                    break;
            case 4:
                    System.out.println ("Jueves");
                    break;
            case 5:
                    System.out.println ("Viernes");
                    break;
            case 6:
                    System.out.println("Sabado");
                    break;
                            
        }



    }
    
}
