import java.util.Scanner;

public class Alg110_DiaSemana {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double dia_de_la_semana;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Centésimo Décimo Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el valor de dia de la semana:");
		dia_de_la_semana = sc.nextDouble();
		if (dia_de_la_semana==1) {
			System.out.println("Lunes");
		}
		if (dia_de_la_semana==2) {
			System.out.println("Martes");
		}
		if (dia_de_la_semana==3) {
			System.out.println("Miércoles");
		}
		if (dia_de_la_semana==4) {
			System.out.println("Jueves");
		}
		if (dia_de_la_semana==5) {
			System.out.println("Viernes");
		}
		if (dia_de_la_semana==6) {
			System.out.println("Sábado");
		}
		if (dia_de_la_semana==7) {
			System.out.println("Domingo");
		}
		if (dia_de_la_semana<1 || dia_de_la_semana>7) {
			System.out.println("Día no válido");
		}
	}

}
