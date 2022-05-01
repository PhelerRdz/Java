import java.util.Scanner;

public class Alg157_Articulos {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double arts;
		String opc;
		double pre;
		double total = 0;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|     Mi Centésimo Quincuagésimo Septimo Algoritmo    |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		do {
			System.out.println("Ingrese la cantidad de Articulos a pagar: ");
			arts = sc.nextDouble();
			System.out.println("Ingresar el precio del articulo a pagar: ");
			pre = sc.nextDouble();
			total = total+(arts*pre);
			System.out.println("El Total a Pagar Hasta Ahora es: "+total);
			System.out.println("Quieres ingresar algun articulo mas? ");
			opc = sc.next();
		} while (opc=="n" || opc=="N");
	}
}
