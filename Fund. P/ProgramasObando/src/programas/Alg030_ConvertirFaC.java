import java.util.Scanner;

public class Alg030_ConvertirFaC {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cel;
		double far;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|                Mi Trigésimo Algoritmo               |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa los grados Fahrenheit");
		far = sc.nextDouble();
		cel = (far-32)*5/9;
		System.out.println("Son "+cel+" grados Celsius");
	}
}
