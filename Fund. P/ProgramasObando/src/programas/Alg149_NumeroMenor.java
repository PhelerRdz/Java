import java.util.Scanner;

public class Alg149_NumeroMenor {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double c;
		double con;
		double conj;
		double n;
		double nmenor;
		double num;
		c = 1;
		conj = 0;
		con=0;
		nmenor = 0;
		num = 0;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|      Mi Centésimo Cuadragésimo Noveno Algoritmo     |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduzca cuantas numeros seran: ");
		n = sc.nextDouble();
		while (c<=n) {
			System.out.println("Introduce un numero: ");
			con = sc.nextDouble();
			if (c==1) {
				nmenor = con;
			}
			c = c+1;
			if (con<nmenor) {
				nmenor = con;
			}
		}
		System.out.println("El numero menor es: "+con);
	}
}
