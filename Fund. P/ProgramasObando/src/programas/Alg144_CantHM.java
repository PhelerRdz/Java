import java.util.Scanner;

public class Alg144_CantHM {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double c;
		double genero;
		double ho;
		double mu;
		double n;
		c = 1;
		mu = 0;
		ho = 0;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|      Mi Centésimo Cuadragésimo Cuarto Algoritmo     |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Digite numero de personas");
		n = sc.nextDouble();
		while (c<=n) {
			System.out.println(c+") Digite 1 para hombres y 2 para mujeres");
			genero = sc.nextDouble();
			if (genero==1) {
				ho = ho+1;
			} else {
				if (genero==2) {
					mu = mu+1;
				}
			}
			c = c+1;
		}
		System.out.println("La cantidad de hombres es: "+ho);
		System.out.println("La cantidad de mujeres es: "+mu);
	}
}
