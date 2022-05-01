import java.util.Scanner;

public class Alg057_BancoPuebla {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cuoesp;
		double cuoordi;
		double pres;
		double presint;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Quincuagésimo Sétimo Algoritmo         |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el prestamo por pedir");
		pres = sc.nextDouble();
		presint = pres*1.24;
		cuoesp = (presint/2)/4;
		cuoordi = (presint/2)/20;
		System.out.println("Cuotas especiales de: "+cuoesp);
		System.out.println("Cuotas ordinarias de: "+cuoordi);
		System.out.println("Total por pagar: "+presint);
	}
}
