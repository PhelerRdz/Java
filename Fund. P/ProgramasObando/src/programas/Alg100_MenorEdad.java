import java.util.Scanner;

public class Alg100_MenorEdad {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double e1;
		double e2;
		double e3;
		String n1;
		String n2;
		String n3;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Centésimo Algoritmo            |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Escribe nombre de la primera persona");
		n1 = sc.next();
		System.out.println("Escribe edad de la primera persona");
		e1 = sc.nextDouble();
		System.out.println("Escribe nombre de la segunda persona");
		n2 = sc.next();
		System.out.println("Escribe edad de la segunda persona");
		e2 = sc.nextDouble();
		System.out.println("Escribe nombre de la tercera persona");
		n3 = sc.next();
		System.out.println("Escribe edad de la tercera persona");
		e3 = sc.nextDouble();
		if ((e1<e2) && (e1<e3)) {
			System.out.println(n1+" es el Menor porque tiene: "+e1+" años.");
		} else {
			if ((e2<e1) && (e2<e3)) {
				System.out.println(n2+" es el Menor porque tiene: "+e2+" años.");
			} else {
				if ((e3<e1) && (e3<e2)) {
					System.out.println(n3+" es el Menor porque tiene: "+e3+" años.");
				}
			}
		}
	}
}
