import java.util.Scanner;

public class Alg050_Promediopar {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double c;
		double c1;
		double c2;
		double c3;
		double c4;
		double c5;
		double cf;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|              Mi Quincuagésimo Algoritmo             |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa calificacion del primer parcial");
		c = sc.nextDouble();
		c1 = c*.15;
		System.out.println("Ingresa calificacion del segundo parcial");
		c = sc.nextDouble();
		c2 = c*.3;
		System.out.println("Ingresa calificacion del tercer parcial");
		c = sc.nextDouble();
		c3 = c*.25;
		System.out.println("Ingresa calificacion del cuarto parcial");
		c = sc.nextDouble();
		c4 = c*.1;
		System.out.println("Ingresa calificacion del quinto parcial");
		c = sc.nextDouble();
		c5 = c*.2;
		cf = c1+c2+c3+c4+c5;
		System.out.println("Calificacion final: "+cf);
	}
}
