import java.util.Scanner;

public class Alg034_Saldocint {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double salf;
		double sali;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Trigésimo Cuarto Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa el saldo inicial");
		sali = sc.nextDouble();
		salf = sali*1.015;
		System.out.println("El saldo final es de: "+salf);
	}
}
