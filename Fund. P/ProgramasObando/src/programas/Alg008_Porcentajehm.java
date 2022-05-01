import java.util.Scanner;

public class Alg008_Porcentajehm {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double hombres;
		double mujeres;
		double porcentajeh;
		double porcentajem;
		double ta;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|                  Mi Octavo Algoritmo                |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Numero de Hombres:");
		hombres = sc.nextDouble();
		System.out.println("Numero de Mujeres:");
		mujeres = sc.nextDouble();
		ta = hombres+mujeres;
		porcentajeh = hombres*100/ta;
		porcentajem = mujeres*100/ta;
		System.out.println("El Numero de Alumnos es: "+ta+" El Porcetaje de Hombres es: "+porcentajeh+"% y El Porcetaje de Mujeres es: "+porcentajem+"%");
	}
}