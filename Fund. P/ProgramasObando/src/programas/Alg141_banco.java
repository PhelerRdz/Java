import java.util.Scanner;

public class Alg141_banco {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double cli;
		double cont;
		double creal;
		double gint;
		double intereses;
		double multa;
		double pca;
		double pmin;
		double pngint;
		double salact;
		double salant;
		gint = 0;
		System.out.print("Introduzca Numero de clientes:");
		cli = sc.nextDouble();
		for (cont=1;cont<=cli;cont++) {
			System.out.println("Cliente No. "+cont);
			System.out.println("Introduzca el valor de las compras realizadas:");
			creal = sc.nextDouble();
			System.out.println("Introduzca el valor de pago del corte anterior:");
			pca = sc.nextDouble();
			System.out.println("Ingrese el valor del saldo anterior:");
			salant = sc.nextDouble();
			if (salant*0.15>pca) {
				intereses = salant*0.12;
				multa = 200;
			} else {
				intereses = 0;
				multa = 0;
			}
			salact = salant+creal-pca+intereses+multa;
			pmin = salact*0.15;
			pngint = salact*0.85;
			gint = gint+intereses;
			System.out.println("Valor de intereses: "+intereses);
			System.out.println("Valor de multa: "+multa);
			System.out.println("Valor de pago minimo: "+pmin);
			System.out.println("Valor de pago para no generar intereses: "+pngint);
			System.out.println("Valor de saldo actual: "+salact);
		}
		System.out.println("Valor de ganacia por intereses : "+gint);
	}
}
