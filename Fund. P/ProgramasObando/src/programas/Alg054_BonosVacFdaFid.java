import java.util.Scanner;

public class Alg054_BonosVacFdaFid {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double anos;
		double años;
		double bonofin;
		double bonov;
		double fidei;
		double suelb;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Quincuagésimo Cuarto Algoritmo         |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el sueldo base quincenal:");
		suelb = sc.nextDouble();
		System.out.println("Ingrese los años de servicio");
		anos = sc.nextDouble();
		bonov = 6+anos;
		bonofin = suelb*3;
		fidei = suelb*.12;
		System.out.println("Tus bonos de vacaciones son de: "+bonov+" días");
		System.out.println("Tus bonos de fin de año son de: "+bonofin);
		System.out.println("Tu fideicomiso es de: "+fidei);
	}
}
