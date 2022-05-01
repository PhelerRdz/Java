
import java.util.Scanner;

public class Alg133_Operaciones2 {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double cont;
		double mayor;
		double menor;
		double num;
		double suma;
		mayor = 0;
		menor = 0;
                suma=0;
		for (cont=1;cont<=10;cont++) {
			System.out.println("Introduzca el Numero "+cont);
			num = sc.nextDouble();
			suma=suma+num;
                        if (cont==1) {
                            mayor = num;
                            menor = num;
                        }
			if ((num>mayor)) {
				mayor = num;
			}
			if ((num<menor)) {
				menor = num;
			}
		}
		System.out.println("La suma es "+suma);
		System.out.println("El Promedio de los Numeros es: "+(suma/10));
		System.out.println("El Numero Mayor es: "+mayor);
		System.out.println("El Numero Menor es: "+menor);
	}
}
