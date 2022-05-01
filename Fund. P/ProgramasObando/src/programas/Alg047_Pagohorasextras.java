import java.util.Scanner;

public class Alg047_Pagohorasextras {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double diat;
		double hrsp;
		double hrst;
		double pago;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|          Mi Cuadragésimo Séptimo Algoritmo          |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa las horas trabajadas");
		hrst = sc.nextDouble();
		System.out.println("Ingresa los días trabajados");
		diat = sc.nextDouble();
		System.out.println("Ingresa las horas perdidas");
		hrsp = sc.nextDouble();
		pago = ((hrst-40+diat)/(hrsp+3))*25;
		System.out.println("El pago de horas extra sería de: "+pago);
	}
}
