/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_022_g;
import java.util.Scanner;


/**
 *
 * @author MCJAVIER
 */
public class Prog_022_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner ps = new Scanner(System.in);
 int coe1,coe2,coe3;

System.out.println ("Ingrese los 3 coeficientes de una ecuacion de segundo grado");

System.out.println ("Ingrese coeficiente termino cuadratico");
    coe1= ps.nextInt();
System.out.println ("Ingrese el coeficiente del termino lineal");
    coe2=ps.nextInt();
System.out.println ("Ingrese el coeficiente de termino independiente");
    coe3=ps.nextInt();
    
    
    if (coe2*coe2-4*coe1*coe3<0){
        System.out.println ("Es una raiz imaginaria/compleja");
    }
    else {
        System.out.println ("Es una raiz real");
        
    }
    }
    
}
