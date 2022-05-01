import java.util.Scanner;
public class Alg156_Bolitas {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double bolita;
		double desc;
		double impdesc;
		String opc;
		double pagar;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|       Mi Centésimo Quincuagésimo Sexto Algoritmo    |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		do {
			System.out.print("Ingrese el valor de importe de la compra:");
			impdesc = sc.nextDouble();
			System.out.println("Ingrese el Numero de la bolita: ");
			System.out.println("0.- Roja");
			System.out.println("1.- Amarilla");
			System.out.println("2.- Blanca");
			bolita = sc.nextDouble();
			desc = 0;
			if (bolita==0) {
				desc = impdesc*0.4;
				System.out.println("Bolita roja");
			}
			if (bolita==1) {
				desc = impdesc*0.25;
				System.out.println("Bolita amarilla");
			}
			if (bolita==2) {
				System.out.println("Bolita blanca");
			}
			pagar = impdesc-desc;
			System.out.println("Valor de bolita: "+bolita);
			System.out.println("Valor de cantidad a pagar: "+pagar);
			System.out.println("Valor de desc: "+desc);
			do {
				System.out.print("¿Desea repetir el proceso? (S/N):");
				opc = sc.next();
			} while (opc=="s" || opc=="n" || opc=="S" || opc=="N");
		} while (opc=="n" || opc=="N");
	}
}
