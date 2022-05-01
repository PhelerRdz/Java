import java.util.Scanner;

public class Alg064_NumerosAscendentes {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double num1;
		double num2;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Sexagésimo Cuarto Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa el primer valor");
		num1 = sc.nextDouble();
		System.out.println("Ingresa el segundo valor");
		num2 = sc.nextDouble();
		if (num1>num2) {
			System.out.println(num1+", "+num2);
		} else {
			System.out.println(num2+", "+num1);
		}
	}
}
