import java.util.Scanner;

public class Alg035_Sueldoprof {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double des;
		double hor;
		double tot;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Trigésimo Quinto Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa las horas trabajadas");
		hor = sc.nextDouble();
		des = hor*(90*.05);
		tot = hor*(90*.95)+des;
		System.out.println("El descuento es: "+des);
		System.out.println("El total a pagar es: "+tot);
	}
}
