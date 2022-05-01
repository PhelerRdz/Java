import java.util.Scanner;

public class Alg137_ceros {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double cantidad;
		double ceros;
		double cont;
		double mayores;
		double menores;
		double num;
		ceros = 0;
		menores = 0;
		mayores = 0;
		System.out.println("Introduzca la cantidad de numeros:");
		num = sc.nextDouble();
		for (cont=1;cont<=num;cont++) {
			System.out.println("Numero "+cont);
			System.out.println("Ingrese el valor de cantidad:");
			cantidad = sc.nextDouble();
			if (cantidad==0) {
				ceros = ceros+1;
			}
			if (cantidad<0) {
				menores = menores+1;
			}
			if (cantidad>0) {
				mayores = mayores+1;
			}
		}
		System.out.println("Cantidad de ceros: "+ceros);
		System.out.println("Menores a cero: "+menores);
		System.out.println("Mayores a cero: "+mayores);
	}
}
