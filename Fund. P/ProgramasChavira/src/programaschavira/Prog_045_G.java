/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_045_g;
import java.util.Scanner;
/**
 *
 * @author MCJAVIER
 */
public class Prog_045_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner ps = new Scanner (System.in);

int suma,prom, valor,may, men=0;

        System.out.println("Ingresa el valor 1");
        valor=ps.nextInt();
        
        suma=valor;
        may=valor;
        men=valor;
        int i;
        for (i=2; i<=10;i++){
        
            System.out.println("Ingresa el valor "+i);
            valor=ps.nextInt();
            suma=suma+valor;
            
            if(valor>may){
            may=valor;
            
            }
            if(valor<men){
            men=valor;
            }
        
        }
        
        prom=suma/10;
        System.out.println("El promedio es: "+prom);
        
        System.out.println("El mayor es: "+may);
        
        System.out.println("El menor es: "+men);


    }
    
}
