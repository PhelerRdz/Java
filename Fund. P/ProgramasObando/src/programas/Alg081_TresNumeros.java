import java.util.Scanner;

public class Alg081_TresNumeros {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		double c;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Octogésimo Primero Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduzca el primer valor: ");
		a = sc.nextDouble();
		System.out.println("Introduzca el segundo valor: ");
		b = sc.nextDouble();
		System.out.println("Introduzca el tercer valor: ");
		c = sc.nextDouble();
		if ((a>b && a>c)) {
			System.out.println("El numero mayor es: "+a);
		} else {
			if ((b>a && b>c)) {
				System.out.println("El numero mayor es: "+b);
			} else {
				System.out.println("El numero mayor es: "+c);
			}
		}
	}
}
