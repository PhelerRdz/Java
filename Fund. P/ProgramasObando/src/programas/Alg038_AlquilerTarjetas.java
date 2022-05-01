import java.util.Scanner;

public class Alg038_AlquilerTarjetas {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cosl;
		double lla;
		double monc;
		double rec;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Trigésimo Octavo Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa las llamadas hechas");
		lla = sc.nextDouble();
		System.out.println("Ingresa el monto consumido");
		monc = sc.nextDouble();
		rec = monc*.2;
		cosl = (monc+rec)/lla;
		System.out.println("El costo por llamada fue de: "+cosl);
	}
}
