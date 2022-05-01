import java.util.Scanner;

public class Alg015_SueldoObrero {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double sueldoa;
		double sueldop;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Décimo Quinto Algoritmo              |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduzca Su Sueldo: ");
		sueldoa = sc.nextDouble();
		sueldop = sueldoa*1.25;
		System.out.println("Tu Sueldo Sera: "+sueldop);
	}
}
