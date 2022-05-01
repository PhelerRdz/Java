import java.util.Scanner;

public class Alg158_Teatro {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double cat1 = 0;
		double cat2 = 0;
		double cat3 = 0;
		double cat4 = 0;
		double cat5 = 0;
		double desc;
		double edad;
		String opc="";
		double pre;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|      Mi Centésimo Quincuagésimo Octavo Algoritmo    |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el valor de precio unico:");
		pre = sc.nextDouble();
		do {
			System.out.println("Ingrese el valor de edad:");
			edad = sc.nextDouble();
			desc = 0;
			if (edad<5) {
				System.out.println("No puede entrar al teatro");
			}
			if (edad>=5 && edad<15) {
				desc = pre*0.35;
				cat1 = cat1+desc;
			}
			if (edad>=15 && edad<20) {
				desc = pre*0.25;
				cat2 = cat2+desc;
			}
			if (edad>=20 && edad<46) {
				desc = pre*0.1;
				cat3 = cat3+desc;
			}
			if (edad>=46 && edad<66) {
				desc = pre*0.25;
				cat4 = cat4+desc;
			}
			if (edad>=66) {
				desc = pre*0.35;
				cat5 = cat5+desc;
			}
			System.out.println("Valor de desc: "+desc);
			System.out.println("");
			do {
				System.out.println("¿Desea repetir el proceso?:");
				opc = sc.next();
			} while (opc=="s" || opc=="n" || opc=="S" || opc=="N");
		} while (opc=="n" || opc=="N");
		System.out.println("Valor de descuentos por categoria 1 : "+cat1);
		System.out.println("Valor de descuentos por categoria 2 : "+cat2);
		System.out.println("Valor de descuentos por categoria 3 : "+cat3);
		System.out.println("Valor de descuentos por categoria 4 : "+cat4);
		System.out.println("Valor de descuentos por categoria 5 : "+cat5);
	}
}
