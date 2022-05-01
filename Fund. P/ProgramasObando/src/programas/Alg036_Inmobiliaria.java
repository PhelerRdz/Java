import java.util.Scanner;

public class Alg036_Inmobiliaria {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cuo;
		double ini;
		double mts;
		double res;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Trigésimo Sexto Algoritmo            |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa los metros a comprar");
		mts = sc.nextDouble();
		res = mts*280;
		System.out.println("Ingresa el pago inicial");
		ini = sc.nextDouble();
		cuo = (res-ini)/12;
		System.out.println("Las 12 cuotas pendientes serían de: "+cuo+"pesos");
	}
}
