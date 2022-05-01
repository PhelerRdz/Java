import java.util.Scanner;

public class Alg051_Hotel5star {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double diah;
		double tot;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|          Mi Quincuagésimo Primero Algoritmo         |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese los días que se hospedara");
		diah = sc.nextDouble();
		tot = diah*400+100;
		System.out.println("El costo total sería de: "+tot);
	}
}
