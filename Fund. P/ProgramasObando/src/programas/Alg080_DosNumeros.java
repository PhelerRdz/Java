import java.util.Scanner;

public class Alg080_DosNumeros {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|               Mi Octogésimo Algoritmo               |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduzca el primer valor: ");
		a = sc.nextDouble();
		System.out.println("Introduzca el segundo valor: ");
		b = sc.nextDouble();
		if (a==b) {
			System.out.println("Resultado es igual a: "+a*b);
		} else {
			if (a>b) {
				System.out.println("El resultado es igual a: "+(a-b));
			} else {
				System.out.println("El resultado es igual a: "+(a+b));
			}
		}
	}
}
