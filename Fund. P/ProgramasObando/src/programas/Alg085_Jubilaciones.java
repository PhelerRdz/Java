import java.util.Scanner;

public class Alg085_Jubilaciones {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double ant;
		double edad;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Octogésimo Quinto Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduzca la edad: ");
		edad = sc.nextDouble();
		System.out.println("Introduzca los años de antiguedad: ");
		ant = sc.nextDouble();
		if (edad>=60 && ant<25) {
			System.out.println("La jubilacion es por edad");
		} else {
			if (edad>=60 && ant>25) {
				System.out.println("La jubilacion es por edad adulta");
			} else {
				if (edad<60 && ant>25) {
					System.out.println("La jubliacion es por edad joven");
				} else {
					System.out.println("No tiene por que jubilarse");
				}
			}
		}
	}
}
