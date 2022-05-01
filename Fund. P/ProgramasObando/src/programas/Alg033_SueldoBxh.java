import java.util.Scanner;

public class Alg033_SueldoBxh {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double bxh;
		double sueb;
		double suet;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Trigésimo Tercero Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa el sueldo base");
		sueb = sc.nextDouble();
		System.out.println("Ingresa la cantidad de hijos");
		bxh = sc.nextDouble();
		suet = sueb+(bxh*80);
		System.out.println("El sueldo total sería de: "+suet);
	}
}
