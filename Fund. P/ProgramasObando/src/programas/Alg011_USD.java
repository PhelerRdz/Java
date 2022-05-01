import java.util.Scanner;

public class Alg011_USD {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double dolares = 0.0;
		double monedanal;
		double usd;
		double valordolar;
		double valordollar = 0;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|                Mi Undécimo Algoritmo                |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresar cantidad a Convertir: ");
		monedanal = sc.nextDouble();
		System.out.println("Ingresar el Valor Del Dolar Actual Convertido a Pesos: ");
		valordolar = sc.nextDouble();
		usd = monedanal/valordollar;
		System.out.println("La Cantidad de: "+monedanal+" mxn. Convertido a Dolares es: "+dolares);
	}
}
