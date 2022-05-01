
package prog_017_g;
import java.util.Scanner;


/**
 *
 * @author MCJAVIER
 */
public class Prog_017_G {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Scanner ps = new Scanner(System.in); 
int cant, pp,sp,inver;

System.out.println ("Un numero de 4 digitos con pares invertidos");
System.out.print ("Ingresa el numero de 4 digtos: ");
cant = ps.nextInt();
pp=cant/100;
sp= cant-(pp*100);
inver=sp*100+pp;
System.out.println (inver);


        
    }
    
}
