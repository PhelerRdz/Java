import java.util.Scanner;


public class Alg096_Votar {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double edad;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Nonagésimo Sexto Algoritmo            |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduzca su edad actual:");
		edad = sc.nextDouble();
		if (edad>=18) {
			System.out.println("Sí puede votar en las próximas elecciones.");
		} else {
			System.out.println("No puede votar en las próximas elecciones.");
		}
	}
}
