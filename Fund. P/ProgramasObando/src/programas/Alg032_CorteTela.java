import java.util.Scanner;

public class Alg032_CorteTela {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cor;
		double cosf;
		double cost;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Trigésimo Segundo Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa el costo por metro");
		cost = sc.nextDouble();
		System.out.println("Ingresa los metros a comprar");
		cor = sc.nextDouble();
		cosf = cost*cor;
		System.out.println("El costo final sería de: "+cosf);
	}
}
