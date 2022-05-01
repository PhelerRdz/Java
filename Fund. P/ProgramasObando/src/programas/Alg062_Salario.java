import java.util.Scanner;

public class Alg062_Salario {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double he;
		double ht;
		double ss;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Sexagésimo Segundo Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa las horas trabajadas:");
		ht = sc.nextDouble();
		if (ht>40) {
			he = ht-40;
			ss = he*20+40*16;
		} else {
			ss = ht*16;
		}
		System.out.println("Tu salario es de: "+ss);
	}
}
