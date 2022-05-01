import java.util.Scanner;

public class Alg105_Autobuses {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double costo_por_km;
		double presupuesto;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Centésimo Quinto Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el valor de costo por km:");
		costo_por_km = sc.nextDouble();
		System.out.println("Ingrese el valor de presupuesto:");
		presupuesto = sc.nextDouble();
		if (costo_por_km*750*2<=presupuesto) {
			System.out.println("México");
		} else {
			System.out.println("Quedarse en casa");
		}
		if (costo_por_km*800*2<=presupuesto) {
			System.out.println("Acapulco");
		}
		if (costo_por_km*1200*2<=presupuesto) {
			System.out.println("Puerto Vallarta");
		}
		if (costo_por_km*1800*2<=presupuesto) {
			System.out.println("Cancún");
		}
	}
}
