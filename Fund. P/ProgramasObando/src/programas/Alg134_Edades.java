
import java.util.Scanner;

public class Alg134_Edades {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
                int cont;
		double edad;
		double may=0;
		double men=0;
		String nmay="";
		String nmen="";
		String nombre;
		for (cont=1;cont<=3;cont++) {
			System.out.println("Dame el nombre de la persona ");
			nombre = sc.next();
			System.out.println("Dame la edad de "+nombre);
			edad = sc.nextDouble();
			if ((cont==1)) {
                                nmay = nombre;
                                nmen = nombre;
				may = edad;
				men = edad;
			}
			if (edad>may) {
				may = edad;
				nmay = nombre;
			}
			if (edad<men) {
				men = edad;
				nmen = nombre;
			}
                }
                System.out.println("La persona con mayor edad es: "+nmay+" con: "+may);
                System.out.println("La persona con menor edad es: "+nmen+" con: "+men);
    }
}
