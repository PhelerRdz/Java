import java.util.Scanner;

public class Alg109_CalifLetra {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double calificacion;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Centésimo Noveno Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el valor de calificacion:");
		calificacion = sc.nextDouble();
		if (calificacion==10) {
			System.out.println("A");
		}
		if (calificacion==9) {
			System.out.println("B");
		}
		if (calificacion==8) {
			System.out.println("C");
		}
		if (calificacion==7) {
			System.out.println("D");
		}
		if (calificacion==6) {
			System.out.println("E");
		}
		if (calificacion<=5) {
			System.out.println("F");
		}
	}
}
