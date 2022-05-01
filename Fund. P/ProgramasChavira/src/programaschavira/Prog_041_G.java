/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_041_g;
import java.util.Scanner;
/**
 *
 * @author MCJAVIER
 */
public class Prog_041_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ps=new Scanner (System.in);
        int tab, resp,acierto=0;

        System.out.println("¿Que tabla quieres que sea el examen?" );
        tab=ps.nextInt();
        int i=0;
        for(i=1;i<=10;i++){
            System.out.print(tab+"*"+i+"= ");
            resp=ps.nextInt();
            if(resp==tab*i){
            
            acierto=acierto+1;
            }
        }
        
        System.out.println("Tienes una calificacion de:"+acierto);
        


    }
    
}
