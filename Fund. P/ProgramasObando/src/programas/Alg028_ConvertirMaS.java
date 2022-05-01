import java.util.Scanner;

public class Alg028_ConvertirMaS {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double min;
		double sec;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Vigésimo Octavo Algoritmo            |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa los minutos");
		min = sc.nextDouble();
		sec = min*60;
		System.out.println("Son "+sec+" segundos");
	}
}
