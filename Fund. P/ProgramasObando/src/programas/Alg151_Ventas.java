import java.util.Scanner;


public class Alg151_Ventas {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double clientes;
		double cont=1;
		double conta=1;
		double productos;
		double totalcompra;
		double totaldia;
		double valorproducto;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|     Mi Centésimo Quincuagésimo Primero Algoritmo    |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("introduzca la cantidad de clientes: ");
		clientes = sc.nextDouble();
		totaldia = 0;
		while (cont<clientes) {
			cont = cont+1;
			System.out.println("Introduzca la cantidad de productos del cliente No. "+cont);
			productos = sc.nextDouble();
			totalcompra = 0;
			while (conta<productos) {
				conta = conta+1;
				System.out.println("Introduzca el valor del productos No. "+conta);
				valorproducto = sc.nextDouble();
				totalcompra = totalcompra+valorproducto;
			}
			System.out.println("El Total de compra del Cliente "+cont+" es: "+totalcompra);
			totaldia = totaldia+totalcompra;
			conta = 0;
		}
		System.out.println("El Total de las ventas del dia fue: "+totaldia);
	}
}
