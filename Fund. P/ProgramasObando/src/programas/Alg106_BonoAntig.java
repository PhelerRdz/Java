import java.util.Scanner;

public class Alg106_BonoAntig {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double antiguedad;
		double bono;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Centésimo Sexto Algoritmo            |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el valor de antiguedad:");
		antiguedad = sc.nextDouble();
		if (antiguedad<=5) {
			bono = antiguedad*100;
		} else {
			bono = 1000;
		}
		System.out.println("Valor de bono: "+bono);
	}
}
