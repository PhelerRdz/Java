import java.util.Scanner;

public class Alg041_SueldoDescuento {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cda;
		double leyp;
		double spf;
		double ss;
		double suelb;
		double suelf;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|          Mi Cuadragésimo Primero Algoritmo          |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa tu sueldo base:");
		suelb = sc.nextDouble();
		leyp = suelb*.01;
		ss = suelb*.04;
		spf = suelb*.005;
		cda = suelb*.05;
		suelf = suelb-leyp-ss-spf-cda;
		System.out.println("El sueldo final sería de: "+suelf);
	}
}
