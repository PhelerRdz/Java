import java.util.Scanner;

public class Alg004_InverCapital {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cap_inv;
		double gan;
		System.out.println("****************************************************");
		System.out.println("|        Universidad Autonoma de Tamaulipas        |");
		System.out.println("|    Facultad de Ingenieria: Arturo Narro Siller   |");
		System.out.println("|      Ingenieria en Sistemas Computacionales      |");
		System.out.println("|           Fundamentos de Programacion            |");
		System.out.println("|              Mi Cuarto Algoritmo                 |");
		System.out.println("|          Desarrollador: Jorge Rodriguez          |");
		System.out.println("****************************************************");
		System.out.println("Introduzca cuanto Invertira a su Capital:");
		cap_inv = sc.nextDouble();
		gan = cap_inv*0.02;
		System.out.println("Tu ganancia al mes es: "+gan);
	}
}
