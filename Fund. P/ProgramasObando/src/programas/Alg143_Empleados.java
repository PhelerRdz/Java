import java.util.Scanner;

public class Alg143_Empleados {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double c;
		double hextra;
		double n;
		double nh;
		double sueldo;
		c = 1;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|      Mi Centésimo Cuadragésimo Tercer Algoritmo     |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Digite el numero de empleados");
		n = sc.nextDouble();
		while (c<=n) {
			System.out.println("Digite el numero de horas trabajadas");
			nh = sc.nextDouble();
			if (nh<=40) {
				sueldo = nh*20;
			} else {
				hextra = nh-40;
				sueldo = (40*20)+(hextra*25);
			}
			System.out.println("El obrero gana "+sueldo);
			c = c+1;
		}
	}

}
