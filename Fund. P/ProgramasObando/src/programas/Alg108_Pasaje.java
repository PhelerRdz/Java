import java.util.Scanner;

public class Alg108_Pasaje {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double costo_del_pasaje;
		double numero_de_alumnos;
		costo_del_pasaje = 70;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Centésimo Octavo Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el valor de numero de alumnos:");
		numero_de_alumnos = sc.nextDouble();
		if (numero_de_alumnos>=20) {
			costo_del_pasaje = 40;
		}
		if (numero_de_alumnos>=40) {
			costo_del_pasaje = 35;
		}
		if (numero_de_alumnos>100) {
			costo_del_pasaje = 20;
		}
		System.out.println("Valor de costo del pasaje: "+costo_del_pasaje);
	}
}
