import java.util.Scanner;

public class Alg150_NumeroMayor {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double c;
		double con;
		double conj;
		double n;
		double nmayor;
		double num;
		c = 1;
		conj = 0;
		nmayor = 0;
		num = 0;
                con=0;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|         Mi Centésimo Quincuagésimo Algoritmo        |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduzca cuantas numeros seran: ");
		n = sc.nextDouble();
		while (c<=n) {
			System.out.println("Introduce un numero: ");
			con = sc.nextDouble();
			if (c==1) {
				nmayor = con;
			}
			c = c+1;
			if (con>nmayor) {
				nmayor = con;
			}
		}
		System.out.println("El numero mayor es: "+con);
	}
}
