import java.util.Scanner;

public class Alg013_Masa {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double masa;
		double pres;
		double temp;
		double volumen;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Décimo Tercero Algoritmo             |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduzca presión del Aire: ");
		pres = sc.nextDouble();
		System.out.println("Introduzca volumen del Aire: ");
		volumen = sc.nextDouble();
		System.out.println("Introduzca temperatura Del Aire: ");
		temp = sc.nextDouble();
		masa = (pres*volumen)/(0.37*(temp+460));
		System.out.println("La masa del Aire es: "+masa);
	}
}
