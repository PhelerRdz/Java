import java.util.Scanner;

public class Alg022_Areacuadrado {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double altura;
		double area;
		double base;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Vigésimo Segundo Algoritmo            |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa la base");
		base = sc.nextDouble();
		System.out.println("Ingresa la altura");
		altura = sc.nextDouble();
		area = base*altura;
		System.out.println("El área del cuadrado es: "+area);
	}
}
