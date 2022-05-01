import java.util.Scanner;

public class Alg039_ReveladoFotos {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cantf;
		double montp;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Trigésimo Noveno Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa la cantidad de fotos para revelar");
		cantf = sc.nextDouble();
		montp = (cantf*1.5)*1.16;
		System.out.println("El monto total sería de: "+montp);
	}
}
