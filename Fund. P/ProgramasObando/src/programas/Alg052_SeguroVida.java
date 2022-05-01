import java.util.Scanner;

public class Alg052_SeguroVida {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double hcmt;
		double per;
		double sdg;
		double tot;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|          Mi Quincuagésimo Segundo Algoritmo         |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese las personas que estarán en el seguro");
		per = sc.nextDouble();
		hcmt = per*5000;
		sdg = hcmt*.05;
		tot = hcmt*1.05;
		System.out.println("El costo de la poliza sería de: "+hcmt);
		System.out.println("El costo del seguro de vida sería de: "+sdg);
		System.out.println("El costo total sería de: "+tot);
	}
}
