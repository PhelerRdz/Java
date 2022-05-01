/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_013_g;
import java.util.Scanner;


/**p
 *
 * @author MCJAVIER
 */
public class Prog_013_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Al ingresar un numero de dos digitos este se invertira
 Scanner ps = new Scanner(System.in);
int numero, numero1 = 0;

System.out.println ("Ingresar un numero de dos cifras y regresara el resultado invertido");
System.out.println ("Ingresa una cifra que tenga solo 2 cifras");
numero = ps.nextInt();
System.out.println ("El numero ingresado es " + numero);
numero1=numero % 10;
numero= numero / 10;
//Todo bien
numero1 = numero1*10 + (numero%10);
System.out.println (numero);
System.out.println (numero1);








    }
    
}
