import java.util.Scanner;

public class Alg005_ComisionesyPagototal {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double com;
		double sueldo;
		double tpag;
		double x1;
		double x2;
		double x3;
		double xy;
		System.out.println("****************************************************");
		System.out.println("|        Universidad Autonoma de Tamaulipas        |");
		System.out.println("|    Facultad de Ingenieria: Arturo Narro Siller   |");
		System.out.println("|      Ingenieria en Sistemas Computacionales      |");
		System.out.println("|           Fundamentos de Programacion            |");
		System.out.println("|              Mi Quinto Algoritmo                 |");
		System.out.println("|          Desarrollador: Jorge Rodriguez          |");
		System.out.println("****************************************************");
		System.out.println("Ingresa el Sueldo Base:");
		sueldo = sc.nextDouble();
		System.out.println("Ingresar Precio de la Venta No. 1:");
		x1 = sc.nextDouble();
		System.out.println("Ingresar Precio de la Venta No. 2:");
		x2 = sc.nextDouble();
		System.out.println("Ingresar Precio de la Venta No. 3:");
		x3 = sc.nextDouble();
		xy = x1+x2+x3;
		com = xy*0.10;
		tpag = sueldo+com;
		System.out.println("El Pago es: "+tpag+" mxn. Y de comisiones son: "+com+" mxn.");
	}
}
