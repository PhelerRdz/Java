import java.util.Scanner;

public class Alg113_BonoNavid {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double antiguedad;
		double bono_navideno;
		double sueldo;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|         Mi Centésimo Décimo Tercero Algoritmo       |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el valor de antiguedad:");
		antiguedad = sc.nextDouble();
		System.out.println("Ingrese el valor de sueldo:");
		sueldo = sc.nextDouble();
		if (antiguedad>4 || sueldo<2000) {
			bono_navideno = sueldo*0.25;
		} else {
			bono_navideno = sueldo*0.2;
		}
		System.out.println("Valor de bono navideno: "+bono_navideno);
	}
}
