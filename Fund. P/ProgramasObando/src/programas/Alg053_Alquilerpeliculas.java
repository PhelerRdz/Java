import java.util.Scanner;

public class Alg053_Alquilerpeliculas {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double dia;
		double pel;
		double tot;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Quincuagésimo Tecero Algoritmo         |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese las peliculas para alquiler");
		pel = sc.nextDouble();
		System.out.println("Ingrese los dias para alquiler");
		dia = sc.nextDouble();
		tot = ((pel*dia)*75)-75;
		System.out.println("El costo total sería de: "+tot);
	}
}
