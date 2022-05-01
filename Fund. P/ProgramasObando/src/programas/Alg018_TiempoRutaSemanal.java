import java.util.Scanner;

public class Alg018_TiempoRutaSemanal {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double tiempoa;
		double tiempob;
		double tiempoc;
		double tiempod;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Décimo Octavo Algoritmo              |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Tiempo Que Logro El Dia Lunes: (seg.)");
		tiempoa = sc.nextDouble();
		System.out.println("Tiempo Que Logro El Dia Miércoles: (seg.)");
		tiempob = sc.nextDouble();
		System.out.println("Tiempo Que Logro El Dia Viernes: (seg.)");
		tiempoc = sc.nextDouble();
		tiempod = (tiempoa+tiempob+tiempoc)/3;
		System.out.println("El tiempo que transcurre es: "+tiempod);
	}
}
