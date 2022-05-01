import java.util.Scanner;

public class Alg042_VentaParcelas {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cred;
		double cuot;
		double pagi;
		double precf;
		double rest;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|          Mi Cuadragésimo Segundo Algoritmo          |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa el costo de la parcela:");
		cred = sc.nextDouble();
		System.out.println("Ingresa el pago inical: ");
		pagi = sc.nextDouble();
		rest = cred-pagi;
		cuot = rest*1.2/24;
		precf = rest*1.2;
		System.out.println("El resto sería en 24 pagos de "+cuot+" y el total sería "+precf);
	}
}
