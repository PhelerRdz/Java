import java.util.Scanner;

public class Alg152_5Club {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double cont;
		double cont2;
		String mesg="";
		double peso=0;
		double prom;
		double suma=0;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|     Mi Centésimo Quincuagésimo Segundo Algoritmo    |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		cont = 1;
		cont2 = 1;
		while (cont<=5) {
			System.out.println("Persona No. "+cont);
			cont = cont+1;
			while (cont2<=10) {
				System.out.println("Introduce el valor del pesaje No. "+cont2);
				cont2 = cont2+1;
				peso = sc.nextDouble();
				suma = suma+peso;
			}
			cont2 = 1;
			prom = suma/10;
			if (peso<prom) {
				mesg = "Bajo";
			} else {
				if (peso>prom) {
					mesg = "Subio";
				}
			}
			System.out.println(mesg);
		}
	}
}
