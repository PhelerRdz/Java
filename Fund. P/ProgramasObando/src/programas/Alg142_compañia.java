import java.util.Scanner;

public class Alg142_compañia {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double cont;
		double cont2;
		double numven;
		double sueldob;
		double sueldotot;
		double totcom;
		double totven;
		double venta;
                sueldotot=0;
                totcom=0;
                totven=0;
                cont=0;
		System.out.println("Introduzca el numero de vendedores: ");
		numven = sc.nextDouble();
		System.out.println("Introduzca el Sueldo Base: ");
		sueldob = sc.nextDouble();
		while (cont<=numven) {
			for (cont2=1;cont2<=3;cont2++) {
				System.out.println("Introduzca el valor de la Venta No. "+cont2);
				venta = sc.nextDouble();
				sueldotot = sueldotot+venta+(venta*0.10)+(sueldob/3);
				totcom = totcom+(venta*0.10);
				totven = totven+(totcom/3)+venta;
			}
			System.out.println("====================================");
			System.out.println("Para el vendedor 1:");
			System.out.println("Sueldo Total: "+sueldotot);
			System.out.println("Total de comisiones: "+totcom);
			System.out.println("Total de venta: "+totven);
			System.out.println("====================================");
			sueldotot = 0;
			totcom = 0;
			totven = 0;
		}
	}
}
