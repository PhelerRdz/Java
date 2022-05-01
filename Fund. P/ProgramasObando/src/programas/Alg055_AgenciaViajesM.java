import java.util.Scanner;

public class Alg055_AgenciaViajesM {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double dias;
		double pers;
		double tot;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Quincuagésimo Quinto Algoritmo         |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el número de personas que irán");
		pers = sc.nextDouble();
		System.out.println("Ingrese el número días que irán");
		dias = sc.nextDouble();
		tot = (1250*pers*dias)*1.16;
		System.out.println("El costo sería de: "+tot);
	}
}
