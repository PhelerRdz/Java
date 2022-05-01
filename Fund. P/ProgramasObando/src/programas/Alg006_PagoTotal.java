import java.util.Scanner;

public class Alg006_PagoTotal {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double d;
		double tc;
		double totalpago;
		double totalpagop;
		totalpago = 0.0;
		System.out.println("****************************************************");
		System.out.println("|        Universidad Autonoma de Tamaulipas        |");
		System.out.println("|    Facultad de Ingenieria: Arturo Narro Siller   |");
		System.out.println("|      Ingenieria en Sistemas Computacionales      |");
		System.out.println("|           Fundamentos de Programacion            |");
		System.out.println("|               Mi Sexto Algoritmo                 |");
		System.out.println("|          Desarrollador: Jorge Rodriguez          |");
		System.out.println("****************************************************");
		System.out.println("Introduzca el valor de la compra: ");
		tc = sc.nextDouble();
		d = tc*0.15;
		totalpagop = tc-d;
		System.out.println("El Pago total: "+totalpago+" mxn.");
	}
}
