import java.util.Scanner;

public class Alg020_Calificacion {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cef;
		double cem;
		double ceq;
		double ct1f;
		double ct1m;
		double ct1q;
		double ct2f;
		double ct2m;
		double ct2q;
		double ct3m;
		double ct3q;
		double pef;
		double pem;
		double peq;
		double pf;
		double pg;
		double pm;
		double pq;
		double ptf;
		double ptm;
		double ptq;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|                Mi Vigésimo Algoritmo                |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Examen de Matematicas: (0-10): ");
		cem = sc.nextDouble();
		System.out.println("Introduce cuanto sacaste en cada una de las tareas de Matematicas (1,2,3) (0-10): ");
		ct1m = sc.nextDouble();
		ct2m = sc.nextDouble();
		ct3m = sc.nextDouble();
		System.out.println("Examen de Fisica: (0-10): ");
		cef = sc.nextDouble();
		System.out.println("Introduce cuanto sacaste en cada una de las tareas de Fisica (1,2) (0-10): ");
		ct1f = sc.nextDouble();
		ct2f = sc.nextDouble();
		System.out.println("Examen Quimica (0-10): ");
		ceq = sc.nextDouble();
		System.out.println("Introduce cuanto sacaste en cada una de las tareas de Quimica (1,2,3 (0-10)): ");
		ct1q = sc.nextDouble();
		ct2q = sc.nextDouble();
		ct3q = sc.nextDouble();
		pem = cem*90/10;
		ptm = (ct1m+ct2m+ct3m)*10/30;
		pef = cef*80/10;
		ptf = (ct1f+ct2f)*20/20;
		peq = ceq*85/10;
		ptq = (ct1q+ct2q+ct3q)*15/30;
		pm = pem+ptm;
		pf = pef+ptf;
		pq = peq+ptq;
		pg = (pm+pf+pq)/3;
		System.out.println("Prom. Matematicas: "+pm+"% Prom. Fisica: "+pf+"% Prom. Quimica: "+pq+"% Prom. General: "+pg+"%");
	}
}