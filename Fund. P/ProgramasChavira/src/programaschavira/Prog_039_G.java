/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_039_g;
import java.util.Scanner;
/**
 *
 * @author MCJAVIER
 */
public class Prog_039_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int tab, r1,r2,r3,r4,r5,r6,r7,r8,r9,r0, cor;
Scanner ps = new Scanner (System.in);

        System.out.println("¿Examen de la tabla ? ");
            tab=ps.nextInt();
        System.out.print(tab+"*1 : ");
            r1=ps.nextInt();
        System.out.print(tab+"*2 : ");
            r2=ps.nextInt();
        System.out.print(tab +"*3 : ");
            r3=ps.nextInt();
        System.out.print(tab +"*4 : ");
            r4=ps.nextInt();
        System.out.print (tab+"*5 : ");
            r5=ps.nextInt();
        System.out.print(tab+"*6 : ");
            r6=ps.nextInt();
        System.out.print(tab+"*7 : ");
            r7=ps.nextInt();
        System.out.print(tab+"*8 : ");
            r8=ps.nextInt();
        System.out.print(tab+"*9 : ");
            r9=ps.nextInt();
        System.out.print(tab+"*10 : ");
            r0=ps.nextInt();
            cor=0;

            
            
        if (r1==tab*1){
            cor=1;
        }    
        if (r2==tab*2){
            cor=cor+1;}
            
        if (r3==tab*3){
            cor=cor+1;}
                if (r4==tab*4){
                    cor=cor+1;}
                    if(r5==tab*5){
                        cor=cor+1;}
                        if (r6==tab*6){
                            cor=cor+1;}
                            if(r7==tab*7){
                                cor=cor+1;}
                                if(r8==tab*8){
                                    cor=cor+1;}
                                    if(r9==tab*9){
                                        cor=cor+1;}
                                        if(r0==tab*10){
                                            cor=cor+1;
                                        }
             
            
            
            
            
            
            
            System.out.println("Tus respuestas correctas "+cor);
 
            
            
            
            
            
    }
    
}
