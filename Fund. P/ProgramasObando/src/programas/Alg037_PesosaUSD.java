import java.util.Scanner;

public class Alg037_PesosaUSD {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double mxn;
		double usd;
		double usds;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Trigésimo Séptimo Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa la cantidad en pesos mexicanos");
		mxn = sc.nextDouble();
		System.out.println("Ingresa el costo del dolar");
		usd = sc.nextDouble();
		usds = mxn/usd;
		System.out.println("Tienes "+usds+"dolares");
	}
}
