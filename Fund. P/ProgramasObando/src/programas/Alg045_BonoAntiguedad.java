import java.util.Scanner;

public class Alg045_BonoAntiguedad {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double anos;
		double años;
		double monto;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Cuadragésimo Quinto Algoritmo          |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa los años laborados");
		anos = sc.nextDouble();
		monto = anos*1200-200;
		System.out.println("El bono correspondiente por tu antigudad es: "+monto);
	}
}
