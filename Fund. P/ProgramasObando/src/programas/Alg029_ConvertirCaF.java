import java.util.Scanner;

public class Alg029_ConvertirCaF {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cel;
		double far;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Vigésimo Novenoo Algoritmo            |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa los grados Celsius");
		cel = sc.nextDouble();
		far = 9/5*cel+32;
		System.out.println("Son "+far+" grados Fahrenheit");
	}
}
