import java.util.Scanner;

public class Alg098_14Feb {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double presupuesto;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Nonagésimo Octavo Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el valor de presupuesto:");
		presupuesto = sc.nextDouble();
		if (presupuesto<=10) {
			System.out.println("Tarjeta");
		}
		if (presupuesto>=11 && presupuesto<=100) {
			System.out.println("Chocolates");
		}
		if (presupuesto>=101 && presupuesto<=250) {
			System.out.println("Flores");
		}
		if (presupuesto>=251) {
			System.out.println("Anillo");
		}
	}
}
