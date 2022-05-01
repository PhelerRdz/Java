import java.util.Scanner;

public class Alg061_AlmacenDescuentos {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double comp;
		double desc;
		double tot;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Sexagésimo Primero Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa el total de tu compra:");
		comp = sc.nextDouble();
		if (comp>1000) {
			desc = comp*.2;
		} else {
			desc = 0;
		}
		tot = comp-desc;
		System.out.println("Tu compra sería de: "+tot);
	}
}
