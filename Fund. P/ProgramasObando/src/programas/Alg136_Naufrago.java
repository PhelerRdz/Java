import java.util.Scanner;

public class Alg136_Naufrago {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double cargo;
		double cont;
		double costo;
		double ham;
		double pago;
		double tham;
		pago = 0;
		System.out.println("Introduzca el No. de hamburguesas");
		ham = sc.nextDouble();
		for (cont=1;cont<=ham;cont++) {
			System.out.println("PROCESO "+cont);
			System.out.println("Seleccione el valor de tipo de hamburguesa.");
			System.out.println("    1.- S sencilla");
			System.out.println("    2.- D doble");
			System.out.println("    3.- T triples");
			tham = sc.nextDouble();
			costo = 0;
			if (tham==1) {
				costo = 20;
			}
			if (tham==2) {
				costo = 25;
			}
			if (tham==3) {
				costo = 28;
			}
			System.out.println("Seleccione el valor de forma de pago.");
			System.out.println("    1.- Efectivo");
			System.out.println("    2.- Tarjeta");
			pago = sc.nextDouble();
			if (pago==1) {
				cargo = 0;
			} else {
				cargo = costo*0.05;
			}
			pago = pago+costo+cargo;
			System.out.println("Valor de cargo: "+cargo);
			System.out.println("Valor de costo: "+costo);
		}
		System.out.println("Valor de pago : "+pago);
	}
}
