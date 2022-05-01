import java.util.Scanner;

public class Alg001_AreaTriangulo {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double altura;
		double area;
		double base;
		area = 0.0;
		altura = 0.0;
		base = 0.0;
		System.out.println("****************************************************");
		System.out.println("|        Universidad Autonoma de Tamaulipas        |");
		System.out.println("|    Facultad de Ingenieria: Arturo Narro Siller   |");
		System.out.println("|      Ingenieria en Sistemas Computacionales      |");
		System.out.println("|           Fundamentos de Programacion            |");
		System.out.println("|              Mi Segundo Algoritmo                |");
		System.out.println("|          Desarrollador: Jorge Rodriguez          |");
		System.out.println("****************************************************");
		System.out.println("Introduzca la Base del Triangulo: ");
		base = sc.nextDouble();
		System.out.println("Introduzca la Altura del Triangulo: ");
		altura = sc.nextDouble();
		System.out.println("El Area del Triangulo es: "+area);
	}
}
