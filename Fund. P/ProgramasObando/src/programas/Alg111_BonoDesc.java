import java.util.Scanner;

public class Alg111_BonoDesc {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double bono;
		double puntos;
		double salario_minimo;
		bono = 0;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|         Mi Centésimo Décimo Primero Algoritmo       |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el valor de puntos:");
		puntos = sc.nextDouble();
		System.out.println("Ingrese el valor de salario minimo:");
		salario_minimo = sc.nextDouble();
		if (puntos<=100) {
			bono = salario_minimo;
		}
		if (puntos>100 && puntos<=150) {
			bono = salario_minimo*2;
		}
		if (puntos>150) {
			bono = salario_minimo*3;
		}
		System.out.println("Valor de bono: "+bono);
	}
}
