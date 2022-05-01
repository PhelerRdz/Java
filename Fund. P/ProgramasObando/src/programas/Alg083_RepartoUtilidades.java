import java.util.Scanner;

public class Alg083_RepartoUtilidades {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double antig;
		double sm;
		double util;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Octogésimo Tercero Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduzca el salario mensual: ");
		sm = sc.nextDouble();
		System.out.println("Introduzca los años de antiguedad: ");
		antig = sc.nextDouble();
		if (antig<1) {
			util = sm*0.05;
		} else {
			if ((antig>=1) && (antig<2)) {
				util = sm*0.07;
			} else {
				if ((antig>=2) && (antig<5)) {
					util = sm*0.10;
				} else {
					if ((antig>=5) && (antig<10)) {
						util = sm*0.15;
					} else {
						util = sm*0.20;
					}
				}
			}
		}
		System.out.println("La utilidad es: "+util);
	}
}
