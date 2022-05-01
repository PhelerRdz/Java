import java.util.Scanner;

public class Alg082_HorasExtras {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double he;
		double ht;
		double pd;
		double pe;
		double pph;
		double pt;
		double tp;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Octogésimo Segundo Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduzca las horas trabajadas: ");
		ht = sc.nextDouble();
		System.out.println("Introduzca el pago por hora: ");
		pph = sc.nextDouble();
		if (ht<=40) {
			tp = ht*pph;
		} else {
			he = ht-40;
			if (he<=8) {
				pe = he*pph*2;
			} else {
				pd = 8*pph*2;
				pt = (he-8)*pph*3;
				pe = pd+pt;
			}
			tp = 40*pph+pe;
		}
		System.out.println("Pago total: "+tp);
	}
}
