/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_013_1g;
import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class PROG_013_1G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner ps = new Scanner(System.in);
int numero, numero1, numero2 ;
System.out.println ("Ingresa un numero con dos digitos y se devolvera el resultado la cifra invertida");
System.out.println ("Ingresa la cifra que contenga solo dos digitos");
numero=ps.nextInt();
System.out.println ("El numero ingresado es " + numero);
numero1=numero/10;
numero1=numero1*10;
numero2=(numero-numero1)*10;
numero1=numero1/10;
numero=numero2+numero1;
System.out.println ("El numero invertido es  " + numero );



    }
    
}
