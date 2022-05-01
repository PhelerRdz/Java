/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_028_g;
import java.util.Scanner;


/**
 *
 * @author MCJAVIER
 */
public class Prog_028_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int dia;

Scanner ps=new Scanner (System.in);
        System.out.print("Ingresa dia de septiembre : ");
        dia=ps.nextInt();
        if (dia%7==0){
            System.out.println("Viernes");
        }else {
            if(dia%7==1){
                System.out.println("Sabado");
            } else {
                if (dia%7==2){
                    System.out.println("Domingo");
                }else {
                    if (dia%7==3){
                        System.out.println("Lunes");
                    }else {
                        if (dia%7==4){
                            System.out.println("Martes");
                        }else {
                            if (dia%7==5){
                                System.out.println("Miercoles");
                            }else {
                                System.out.println("Jueves6");
                            }
                        }
                    }
                }
            } 
        }
       
    }
    
}
