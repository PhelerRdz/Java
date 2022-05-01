import java.util.Scanner;

public class Alg102_Becas {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double beca;
		double edad;
		double promedio;
		beca = 0;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Centésimo Segundo Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el valor de edad:");
		edad = sc.nextDouble();
		System.out.println("Ingrese el valor de promedio:");
		promedio = sc.nextDouble();
		if (edad>18 && promedio>=9) {
			beca = 2000;
		}
		if (edad>18 && promedio>=7.5 && promedio<9) {
			beca = 1000;
		}
		if (edad>18 && promedio>=6 && promedio<7.5) {
			beca = 500;
		}
		if (edad<=18 && promedio>=9) {
			beca = 3000;
		}
		if (edad<=18 && promedio>=8 && promedio<9) {
			beca = 2000;
		}
		if (edad>18 && promedio>=6 && promedio<8) {
			beca = 100;
		}
		if (promedio<6) {
			System.out.println("Se envía carta de invitación a estudiar más");
		}
		System.out.println("Valor de beca: "+beca);
	}
}
