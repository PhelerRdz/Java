import java.util.Scanner;

public class Alg040_Taximetro {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cost;
		double km;
		double min;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|              Mi Cuadragésimo Algoritmo              |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa los kilometros recorridos:");
		km = sc.nextDouble();
		System.out.println("Ingresa los minutos transcurridos:");
		min = sc.nextDouble();
		cost = (km*25)+(min*10);
		System.out.println("El costo de la carrera sería de: "+cost);
	}
}
