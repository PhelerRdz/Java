
package prog_015_g;
import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class Prog_015_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner ps = new Scanner(System.in);
int centena,decena,unidad,falta,cant;

System.out.println ("Se mostrara las centenas, decenas y unidades deun numero de 3 digitos que se ingrese");
System.out.println ("Dame el numero de 3 digitos");
cant=ps.nextInt();
centena=cant/100;
falta=cant-(centena*100);
decena=falta/10;
falta=falta-(decena*10);
unidad=falta/1;
System.out.print ("Tu numero tiene ");
System.out.print ("centenas "+centena);
System.out.print (",decenas " +decena);
System.out.println (",unidades " +unidad);
    }
    
}
