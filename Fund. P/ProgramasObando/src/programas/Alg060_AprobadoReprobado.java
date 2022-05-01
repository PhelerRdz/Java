import java.util.Scanner;

public class Alg060_AprobadoReprobado {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cal1;
		double cal2;
		double cal3;
		double prom;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|               Mi Sexagésimo Algoritmo               |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa calificacion del primer parcial");
		cal1 = sc.nextDouble();
		System.out.println("Ingresa calificacion del segundo parcial");
		cal2 = sc.nextDouble();
		System.out.println("Ingresa calificacion del tercer parcial");
		cal3 = sc.nextDouble();
		prom = (cal1+cal2+cal3)/3;
		if (prom>=70) {
			System.out.println("Alumno aprobado");
		} else {
			System.out.println("Alumno reprobado");
		}
	}

}
