import java.util.Scanner;

public class Alg007_CalifFinal {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double c1;
		double c2;
		double c3;
		double calif1;
		double calif2;
		double calif3;
		double cf;
		double exfn;
		double pef;
		double ppar;
		double prom;
		double ptf;
		double tfn;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|                 Mi Séptimo Algoritmo                |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduzca su 1° Calificación:");
		calif1 = sc.nextDouble();
		System.out.println("Introduzca su 2° Calificación:");
		calif2 = sc.nextDouble();
		System.out.println("Introduzca su 3° Calificación:");
		calif3 = sc.nextDouble();
		System.out.println("Introduzca la Calificación Del Examen Final");
		exfn = sc.nextDouble();
		System.out.println("Introduzca la Calificación Del Trabajo Final");
		tfn = sc.nextDouble();
		prom = (calif1+calif2+calif3)/3;
		ppar = prom*0.55;
		pef = exfn*0.30;
		ptf = tfn*0.15;
		cf = ppar+pef+ptf;
		System.out.println("La Calificación Final es: "+cf);
	}
}
