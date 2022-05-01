
import java.util.Scanner;


public class Alg146_PromCalif2 {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double c;
		double calif;
		double na;
		double ncalf;
		double prom;
		double suma;
		c = 1;
		ncalf = 0;
		suma = 0;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|       Mi Centésimo Cuadragésimo Sexto Algoritmo     |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Digite el numero de alumnos");
		na = sc.nextDouble();
		while (c<=na) {
			System.out.println("digite calificacion");
			calif = sc.nextDouble();
			suma = suma+calif;
			c = c+1;
		}
		prom = suma/na;
		System.out.println("El promedio de calificaciones es "+prom);
	}
}
