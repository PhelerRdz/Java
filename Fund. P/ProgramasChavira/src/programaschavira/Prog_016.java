/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_016;
import java.util.Scanner;
/**
 *
 * @author sebastianmuro
 */
public class Prog_016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ps = new Scanner (System.in);
        
        double cant1, cant2, decimal;
        int resultado, pd;
        System.out.println("Dividir numeros");
        System.out.println("Dame la primera cantidad ");
        cant1 = ps.nextDouble();
        System.out.println("Dame la segunda cantidad");
        cant2 = ps.nextDouble();
        resultado = (int)(cant1/cant2);
        decimal = (cant1/cant2) - resultado;
        pd = (int) (decimal*100);
        System.out.println (resultado+"."+pd);
        
        
        
        
                
    }
    
}
