import java.util.Scanner;

public class Alg003_ConversionesMoneda {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double dollar;
		double dollars;
		double euro;
		double euros;
		double libra;
		double libras;
		double monedanal;
		double monnal;
		double usd;
		double yen;
		double yens;
		System.out.println("****************************************************");
		System.out.println("|        Universidad Autonoma de Tamaulipas        |");
		System.out.println("|    Facultad de Ingenieria: Arturo Narro Siller   |");
		System.out.println("|      Ingenieria en Sistemas Computacionales      |");
		System.out.println("|           Fundamentos de Programacion            |");
		System.out.println("|              Mi Tercer Algoritmo                 |");
		System.out.println("|          Desarrollador: Jorge Rodriguez          |");
		System.out.println("****************************************************");
		System.out.println("  Introduzca la Moneda Nacional:");
		monedanal = sc.nextDouble();
		System.out.println("  Precio Dollar:");
		dollar = sc.nextDouble();
		System.out.println("  Precio Euro:");
		euro = sc.nextDouble();
		System.out.println("  Precio Libra:");
		libra = sc.nextDouble();
		System.out.println("  Precio Yen:");
		yen = sc.nextDouble();
		libras = monedanal/libra;
		euros = monedanal/euro;
		dollars = monedanal/dollar;
		yens = monedanal/yen;
		System.out.println("  "+monedanal+" Pesos Mexicanos, Equivalen a: "+dollars+" Dolares");
		System.out.println("  "+monedanal+" Pesos Mexicanos, Equivalen a: "+euros+" Euros");
		System.out.println("  "+monedanal+" Pesos Mexicanos, Equivalen a: "+libras+" Libras Esterlinas");
		System.out.println("  "+monedanal+" Pesos Mexicanos, Equivalen a: "+yens+" Yens");
	}
}
