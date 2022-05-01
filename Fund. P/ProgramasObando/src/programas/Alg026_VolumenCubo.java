import java.util.Scanner;

public class Alg026_VolumenCubo {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double lado;
		double volumen;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Vigésimo Sexto Algoritmo             |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa la medida del lado");
		lado = sc.nextDouble();
		volumen = lado*lado*lado;
		System.out.println("El volumen del cubo es: "+volumen);
	}
}
